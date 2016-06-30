-- Inserts para o banco de dados de futebol das Olimpíadas Rio 2016

insert into Cidade (nome, estado) values ('Sao Paulo', 'SP');
insert into Cidade (nome, estado) values ('Manaus', 'AM');
insert into Cidade (nome, estado) values ('Brasilia', 'DF');
insert into Cidade (nome, estado) values ('Salvador', 'BA');
insert into Cidade (nome, estado) values ('Rio de Janeiro', 'RJ');
insert into Cidade (nome, estado) values ('Belo Horizonte', 'BH');

insert into Estadio (nome, max_torcedores, id_cidade) values ('Arena Corinthians', 49205, 1);
insert into Estadio (nome, max_torcedores, id_cidade) values ('Arena Amazonia', 40549, 2);
insert into Estadio (nome, max_torcedores, id_cidade) values ('Arena Fonte Nova', 50000, 4);
insert into Estadio (nome, max_torcedores, id_cidade) values ('Estadio Mane Garrincha', 72788, 3);
insert into Estadio (nome, max_torcedores, id_cidade) values ('Estadio Olimpico', 46931, 5);
insert into Estadio (nome, max_torcedores, id_cidade) values ('Maracana', 78838, 5);
insert into Estadio (nome, max_torcedores, id_cidade) values ('Mineirao', 61846, 6);

insert into Juiz (nome, idade, nacionalidade) values ('Adailton Souza Barros', 33, 'Brasileiro');
insert into Juiz (nome, idade, nacionalidade) values ('Jaroslaw Kaczynski', 42, 'Polones');
insert into Juiz (nome, idade, nacionalidade) values ('Enrique Pena Nieto', 35, 'Mexicano');

insert into Continente (nome) values ('America');
insert into Continente (nome) values ('Africa');
insert into Continente (nome) values ('Europa');
insert into Continente (nome) values ('Asia');
insert into Continente (nome) values ('Oceania');
insert into Continente (nome) values ('Antartida');

insert into Rodada (nome) values ('Quartas de final');
insert into Rodada (nome) values ('Semifinais');
insert into Rodada (nome) values ('Disputa do Bronze');
insert into Rodada (nome) values ('Final');

insert into Centro_Olimpico (nome, endereco, id_cidade) values ('Pele', 'Bairro Bom Jardim, 321', 1);
insert into Centro_Olimpico (nome, endereco, id_cidade) values ('Dunga', 'Rua da mata, 143', 2); 
insert into Centro_Olimpico (nome, endereco, id_cidade) values ('Mane Garrincha', 'Vila Planalto, QL 22', 3); 
insert into Centro_Olimpico (nome, endereco, id_cidade) values ('Chaves', 'Bairro do Axé, 564', 4); 
insert into Centro_Olimpico (nome, endereco, id_cidade) values ('Vila Nova', 'Vila do O, 83', 5); 

insert into Selecao (pais, pontos, foto_equipe, id_centro_olimpico, id_continente) values('Brasil', 0, '0', 1, 1);
insert into Selecao (pais, pontos, foto_equipe, id_centro_olimpico, id_continente) values('Estados Unidos', 0, '0', 2, 1);
insert into Selecao (pais, pontos, foto_equipe, id_centro_olimpico, id_continente) values('Inglaterra', 0, '0', 3, 3);
insert into Selecao (pais, pontos, foto_equipe, id_centro_olimpico, id_continente) values('Nigeria', 0, '0', 4, 2);
insert into Selecao (pais, pontos, foto_equipe, id_centro_olimpico, id_continente) values('China', 0, '0', 5, 4);

insert into Torcida (nome, n_torcedores, id_selecao) values ('Canarinho', 750, 1);
insert into Torcida (nome, n_torcedores, id_selecao) values ('Screaming Eagles', 500, 2);
insert into Torcida (nome, n_torcedores, id_selecao) values ('Hooligans', 372, 3);

insert into Titulo (campeonato, ano, id_selecao) values ('Campeao Olimpico', '10-07-1996', 4);
insert into Titulo (campeonato, ano, id_selecao) values ('Campeao Olimpico', '23-06-1912', 3);
insert into Titulo (campeonato, ano, id_selecao) values ('Campeao do Mundo', '13-07-2002', 1);
insert into Titulo (campeonato, ano, id_selecao) values ('Campeao do Mundo', '15-07-1994', 1);
insert into Titulo (campeonato, ano, id_selecao) values ('Campeao do Mundo', '24-07-1970', 1);

insert into Tecnico (nome, idade, nacionalidade, id_selecao) values('Tite', 55, 'Brasileiro', 1);
insert into Tecnico (nome, idade, nacionalidade, id_selecao) values('Jurgen Klinsmann', 51, 'Alemao', 2);
insert into Tecnico (nome, idade, nacionalidade, id_selecao) values('Roy Hodgson', 68, 'Ingles', 3);
insert into Tecnico (nome, idade, nacionalidade, id_selecao) values('Daniel Amokachi', 43, 'Nigeriano', 4);
insert into Tecnico (nome, idade, nacionalidade, id_selecao) values('Alain Perrin', 59, 'Frances', 5);

insert into Equipe_medica (n_integrantes, id_selecao) values(10, 1);
insert into Equipe_medica (n_integrantes, id_selecao) values(9, 2);
insert into Equipe_medica (n_integrantes, id_selecao) values(11, 3);
insert into Equipe_medica (n_integrantes, id_selecao) values(7, 4);
insert into Equipe_medica (n_integrantes, id_selecao) values(15, 5);

insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Neymar', 24, 'Brasileiro', 1);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Kaka', 34, 'Brasileiro', 1);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Wondolowski', 33, 'Americano', 2);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Wood', 24, 'Americano', 2);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Rooney', 30, 'Ingles', 3);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Vardy', 29, 'Ingles', 3);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Mikel', 29, 'Nigeriano', 4);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Enyeama', 33, 'Nigeriano', 4);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Zhi', 35, 'Chines', 5);
insert into Jogador (nome, idade, nacionalidade, id_selecao) values('Lin', 30, 'Chines', 5);

insert into Patrocinador (nome, id_selecao) values ('Adidas', 2);
insert into Patrocinador (nome, id_selecao) values ('Katsumi', 5);
insert into Patrocinador (nome, id_selecao) values ('Afreaka', 4);
insert into Patrocinador (nome, id_selecao) values ('McLaren', 3);
insert into Patrocinador (nome, id_selecao) values ('Bradesco', 1);

insert into premiacao (categoria, id_selecao) values ('Ouro', 1);
insert into premiacao (categoria, id_selecao) values ('Prata', 3);
insert into premiacao (categoria, id_selecao) values ('Bronze', 2);
insert into premiacao (categoria, id_selecao) values ('Artilheiro', 1);
insert into premiacao (categoria, id_selecao) values ('Melhor Jogador', 4);

insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('20-08-2016 20:00:00-03', 3, 2, 4, 1, 6, 1, 3);
insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('19-08-2016 20:00:00-03', 4, 1, 3, 3, 7, 2, 4);
insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('17-08-2016 20:00:00-03', 2, 3, 2, 1, 5, 2, 1);
insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('16-08-2016 20:00:00-03', 1, 2, 2, 2, 4, 4, 3);
insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('13-08-2016 20:00:00-03', 3, 4, 1, 2, 3, 2, 4);
insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('07-08-2016 20:00:00-03', 5, 2, 1, 3, 2, 2, 5);
insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('06-08-2016 20:00:00-03', 1, 0, 1, 1, 1, 1, 3);
insert into partida (data_hora ,placarA ,placarB ,id_rodada ,id_juiz ,id_estadio ,id_selecaoA ,id_selecaoB)
	values ('12-08-2016 20:00:00-03', 3, 2, 1, 3, 6, 3, 5);