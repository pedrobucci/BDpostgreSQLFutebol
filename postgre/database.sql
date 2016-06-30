drop schema public cascade;	-- Comando para apagar o banco de dados existente
create schema public;		-- Criar o novo banco

CREATE TABLE Rodada (
	id serial PRIMARY KEY,
	nome varchar(50) not null
);

CREATE TABLE Juiz (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	idade int not null,
	nacionalidade varchar(50) not null
);

CREATE TABLE Continente (
	id serial PRIMARY KEY,
	nome varchar(50) not null
);

CREATE TABLE Cidade (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	estado varchar(50) not null
);

CREATE TABLE Estadio (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	max_torcedores int not null,
	id_cidade int not null,
	FOREIGN KEY(id_cidade) REFERENCES Cidade (id)
);

create table Centro_Olimpico (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	endereco varchar(100) not null,
	id_cidade int not null,
	FOREIGN KEY(id_cidade) REFERENCES Cidade (id)
);

CREATE TABLE Selecao (
	id serial PRIMARY KEY,
	pais varchar(50) not null,
	pontos int not null,
	foto_equipe bytea not null,		-- campo para colocar a foto da equipe
	id_continente int not null,
	id_centro_olimpico int not null,
	FOREIGN KEY(id_centro_olimpico) REFERENCES Centro_Olimpico (id),
	FOREIGN KEY(id_continente) REFERENCES Continente (id)
);

CREATE TABLE Partida (
	id serial PRIMARY KEY,
	data_hora TIMESTAMP WITH TIME ZONE not null,
	placarA int not null,
	placarB int not null,
	id_rodada int not null,
	id_juiz int not null,
	id_estadio int not null,
	id_selecaoA int not null,
	id_selecaoB int not null,
	FOREIGN KEY(id_rodada) REFERENCES Rodada (id),
	FOREIGN KEY(id_juiz) REFERENCES Juiz (id),
	FOREIGN KEY(id_estadio) REFERENCES Estadio (id),
	FOREIGN KEY(id_selecaoA) REFERENCES Selecao (id),
	FOREIGN KEY(id_SelecaoB) REFERENCES Selecao (id)
);

CREATE TABLE Jogador (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	idade int not null,
	nacionalidade varchar(50) not null,
	id_selecao int not null,
	FOREIGN KEY(id_selecao) REFERENCES Selecao (id)
);

CREATE TABLE Tecnico (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	idade int not null,
	nacionalidade varchar(50) not null,
	id_selecao int not null,
	FOREIGN KEY(id_selecao) REFERENCES Selecao (id)
);

CREATE TABLE Patrocinador (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	id_selecao int not null,
	FOREIGN KEY(id_selecao) REFERENCES Selecao (id)
);

CREATE TABLE Torcida (
	id serial PRIMARY KEY,
	nome varchar(50) not null,
	n_torcedores int not null,
	id_selecao int not null,
	FOREIGN KEY(id_selecao) REFERENCES Selecao (id)
);

CREATE TABLE Premiacao (
	id serial PRIMARY KEY,
	categoria varchar(50) not null,
	id_selecao int not null,
	FOREIGN KEY(id_selecao) REFERENCES Selecao (id)
);

CREATE TABLE Titulo (
	id serial PRIMARY KEY,
	campeonato varchar(50) not null,
	ano date not null,
	id_selecao int not null,
	FOREIGN KEY(id_selecao) REFERENCES Selecao (id)
);

create table Equipe_medica (
	id serial PRIMARY KEY,
	n_integrantes int not null,
	id_selecao int not null,
	FOREIGN KEY(id_selecao) REFERENCES Selecao (id)
);

CREATE VIEW tabela_de_jogos as
	select 	rodada.nome as "Rodada",
			selecaoA.pais as "Time A",
			Partida.placarA as "A",
			Partida.placarB as "B",
			selecaoB.pais as "Time B",
			estadio.nome as "Local",
			Partida.data_hora as "Data/Hora"
	from	rodada,
			Partida,
			Selecao selecaoA,
			Selecao selecaoB,
			estadio
	where	rodada.id = Partida.id_rodada
		and	partida.id_selecaoa = selecaoA.id
		and	partida.id_selecaoB = selecaoB.id
		and	partida.id_estadio = estadio.id;

create function atualiza_pontos () returns trigger as $atualiza_pontos$
	begin
		if new.placarA > new.placarB then
			--ponto para A
			update selecao set pontos = pontos + 3 where id = new.id_selecaoA;
		end if;
		if new.placarB > new.placarA then
			--ponto para B
			update selecao set pontos = pontos + 3 where id = new.id_selecaoB;
		end if;
		if new.placarA = new.placarB then
			--empate
			update selecao set pontos = pontos + 1 where id = new.id_selecaoA;
			update selecao set pontos = pontos + 1 where id = new.id_selecaoB;
		end if;
		return new;
	end;
$atualiza_pontos$ language plpgsql;

CREATE TRIGGER atualiza_pontos
AFTER INSERT ON partida
    FOR EACH ROW EXECUTE PROCEDURE atualiza_pontos();