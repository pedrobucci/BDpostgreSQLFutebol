package bancopostgres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

public class janelaBanco extends JFrame {
	private JTextField colunaJogadores;
	private JTextField colunaJogadores_1;
	private JTextField colunaJogadores_2;
	private JTextField colunaJogadores_3;
	private JTextField colunaJogadores_4;
	private JTextField colunaJogadores_5;
	private Panel painelSelecao;
	private JTextPane exibeSelecoes;
	private JTextField colunaSelecoes_1;
	private JTextField colunaSelecoes_2;
	private JTextField colunaSelecoes_3;
	private JTextField colunaSelecoes_4;
	private JTextField colunaSelecoes_5;
	private Panel painelTecnicos;
	private JTextField colunaTecnicos_1;
	private JTextField colunaTecnicos_2;
	private JTextField colunaTecnicos_3;
	private JTextField colunaTecnicos_4;
	private JTextField colunaTecnicos_5;
	private JTextPane exibeTecnicos;
	private Panel tabelaDosJogos;
	private JTextPane exibeTabelaDosJogos;
	private JButton btnBuscarSlc;
	private JButton btnAdicionarSlc;
	private JButton btnDeletarSlc;
	private JButton btnAtualizarSlc;
	private JButton btnBuscar;
	private JButton btnAdicionar;
	private JButton btnDeletar;
	private JButton btnAtualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelaBanco frame = new janelaBanco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public janelaBanco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("434px"),},
			new RowSpec[] {
				RowSpec.decode("31px"),
				RowSpec.decode("231px"),}));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, "1, 1, 1, 2, fill, fill");
		
		Panel painelJogadores = new Panel();
		tabbedPane.addTab("Jogadores", null, painelJogadores, null);
		
		colunaJogadores_1 = new JTextField();
		colunaJogadores_1.setColumns(10);
		
		colunaJogadores_2 = new JTextField();
		colunaJogadores_2.setColumns(10);
		
		colunaJogadores_3 = new JTextField();
		colunaJogadores_3.setColumns(10);
		
		colunaJogadores_4 = new JTextField();
		colunaJogadores_4.setColumns(10);
		
		colunaJogadores_5 = new JTextField();
		colunaJogadores_5.setColumns(10);
		
		JTextPane exibeJogadores = new JTextPane();
		
		JButton btnAdicionarJgds = new JButton("Adicionar");
		
		JButton btnDeletarJgds = new JButton("Deletar");
		
		JButton btnAtualizarJgds = new JButton("Atualizar");
		
		JButton btnBuscarJgds = new JButton("Buscar");
		GroupLayout gl_painelJogadores = new GroupLayout(painelJogadores);
		gl_painelJogadores.setHorizontalGroup(
			gl_painelJogadores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelJogadores.createSequentialGroup()
					.addGroup(gl_painelJogadores.createParallelGroup(Alignment.LEADING)
						.addComponent(exibeJogadores)
						.addGroup(gl_painelJogadores.createSequentialGroup()
							.addGap(6)
							.addComponent(colunaJogadores_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(colunaJogadores_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(colunaJogadores_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(colunaJogadores_4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(colunaJogadores_5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_painelJogadores.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBuscarJgds)
							.addGap(58)
							.addComponent(btnAdicionarJgds)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeletarJgds)
							.addGap(69)
							.addComponent(btnAtualizarJgds)))
					.addContainerGap())
		);
		gl_painelJogadores.setVerticalGroup(
			gl_painelJogadores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelJogadores.createSequentialGroup()
					.addGroup(gl_painelJogadores.createParallelGroup(Alignment.BASELINE)
						.addComponent(colunaJogadores_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaJogadores_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaJogadores_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaJogadores_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaJogadores_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(exibeJogadores, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelJogadores.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAtualizarJgds)
						.addComponent(btnBuscarJgds)
						.addComponent(btnAdicionarJgds)
						.addComponent(btnDeletarJgds))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelJogadores.setLayout(gl_painelJogadores);
		
		painelSelecao = new Panel();
		tabbedPane.addTab("Sele\u00E7\u00F5es", null, painelSelecao, null);
		
		exibeSelecoes = new JTextPane();
		
		colunaSelecoes_1 = new JTextField();
		colunaSelecoes_1.setColumns(10);
		
		colunaSelecoes_2 = new JTextField();
		colunaSelecoes_2.setColumns(10);
		
		colunaSelecoes_3 = new JTextField();
		colunaSelecoes_3.setColumns(10);
		
		colunaSelecoes_4 = new JTextField();
		colunaSelecoes_4.setColumns(10);
		
		colunaSelecoes_5 = new JTextField();
		colunaSelecoes_5.setColumns(10);
		
		btnBuscarSlc = new JButton("Buscar");
		
		btnAdicionarSlc = new JButton("Adicionar");
		
		btnDeletarSlc = new JButton("Deletar");
		
		btnAtualizarSlc = new JButton("Atualizar");
		GroupLayout gl_painelSelecao = new GroupLayout(painelSelecao);
		gl_painelSelecao.setHorizontalGroup(
			gl_painelSelecao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelSelecao.createSequentialGroup()
					.addGroup(gl_painelSelecao.createParallelGroup(Alignment.LEADING)
						.addComponent(exibeSelecoes, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
						.addGroup(gl_painelSelecao.createSequentialGroup()
							.addGap(6)
							.addComponent(colunaSelecoes_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(colunaSelecoes_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(colunaSelecoes_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(colunaSelecoes_4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(colunaSelecoes_5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painelSelecao.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBuscarSlc)
							.addGap(59)
							.addComponent(btnAdicionarSlc)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeletarSlc)
							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
							.addComponent(btnAtualizarSlc)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(81))
		);
		gl_painelSelecao.setVerticalGroup(
			gl_painelSelecao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelSelecao.createSequentialGroup()
					.addGroup(gl_painelSelecao.createParallelGroup(Alignment.BASELINE)
						.addComponent(colunaSelecoes_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaSelecoes_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaSelecoes_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaSelecoes_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaSelecoes_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(exibeSelecoes, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelSelecao.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscarSlc)
						.addComponent(btnAtualizarSlc)
						.addComponent(btnDeletarSlc)
						.addComponent(btnAdicionarSlc))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelSelecao.setLayout(gl_painelSelecao);
		
		painelTecnicos = new Panel();
		tabbedPane.addTab("T\u00E9cnicos", null, painelTecnicos, null);
		
		colunaTecnicos_1 = new JTextField();
		colunaTecnicos_1.setColumns(10);
		
		colunaTecnicos_2 = new JTextField();
		colunaTecnicos_2.setColumns(10);
		
		colunaTecnicos_3 = new JTextField();
		colunaTecnicos_3.setColumns(10);
		
		colunaTecnicos_4 = new JTextField();
		colunaTecnicos_4.setColumns(10);
		
		colunaTecnicos_5 = new JTextField();
		colunaTecnicos_5.setColumns(10);
		
		exibeTecnicos = new JTextPane();
		
		btnBuscar = new JButton("Buscar");
		
		btnAdicionar = new JButton("Adicionar");
		
		btnDeletar = new JButton("Deletar");
		
		btnAtualizar = new JButton("Atualizar");
		GroupLayout gl_painelTecnicos = new GroupLayout(painelTecnicos);
		gl_painelTecnicos.setHorizontalGroup(
			gl_painelTecnicos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTecnicos.createSequentialGroup()
					.addGroup(gl_painelTecnicos.createParallelGroup(Alignment.LEADING)
						.addComponent(exibeTecnicos, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
						.addGroup(gl_painelTecnicos.createSequentialGroup()
							.addGap(6)
							.addComponent(colunaTecnicos_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(colunaTecnicos_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(colunaTecnicos_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(colunaTecnicos_4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(colunaTecnicos_5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painelTecnicos.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBuscar)
							.addGap(60)
							.addComponent(btnAdicionar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeletar)
							.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
							.addComponent(btnAtualizar)))
					.addContainerGap())
		);
		gl_painelTecnicos.setVerticalGroup(
			gl_painelTecnicos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelTecnicos.createSequentialGroup()
					.addGroup(gl_painelTecnicos.createParallelGroup(Alignment.BASELINE)
						.addComponent(colunaTecnicos_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaTecnicos_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaTecnicos_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaTecnicos_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(colunaTecnicos_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(exibeTecnicos, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelTecnicos.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscar)
						.addComponent(btnAtualizar)
						.addComponent(btnDeletar)
						.addComponent(btnAdicionar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		painelTecnicos.setLayout(gl_painelTecnicos);
		
		tabelaDosJogos = new Panel();
		tabbedPane.addTab("Tabela dos Jogos", null, tabelaDosJogos, null);
		
		exibeTabelaDosJogos = new JTextPane();
		
		JButton btnVejaATabela = new JButton("Veja a Tabela dos Jogos");
		btnVejaATabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_tabelaDosJogos = new GroupLayout(tabelaDosJogos);
		gl_tabelaDosJogos.setHorizontalGroup(
			gl_tabelaDosJogos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabelaDosJogos.createSequentialGroup()
					.addGroup(gl_tabelaDosJogos.createParallelGroup(Alignment.LEADING)
						.addComponent(exibeTabelaDosJogos, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
						.addGroup(gl_tabelaDosJogos.createSequentialGroup()
							.addGap(135)
							.addComponent(btnVejaATabela)))
					.addContainerGap())
		);
		gl_tabelaDosJogos.setVerticalGroup(
			gl_tabelaDosJogos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabelaDosJogos.createSequentialGroup()
					.addComponent(btnVejaATabela)
					.addGap(8)
					.addComponent(exibeTabelaDosJogos, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
					.addContainerGap())
		);
		tabelaDosJogos.setLayout(gl_tabelaDosJogos);
		
		Panel procedures = new Panel();
		tabbedPane.addTab("Procedimentos", null, procedures, null);
		
		JTextPane exibeProcedimentos = new JTextPane();
		
		JButton btnProcedimentos = new JButton("Rodar Procedimentos");
		GroupLayout gl_procedures = new GroupLayout(procedures);
		gl_procedures.setHorizontalGroup(
			gl_procedures.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_procedures.createSequentialGroup()
					.addGroup(gl_procedures.createParallelGroup(Alignment.LEADING)
						.addComponent(exibeProcedimentos, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
						.addGroup(gl_procedures.createSequentialGroup()
							.addGap(142)
							.addComponent(btnProcedimentos)))
					.addContainerGap())
		);
		gl_procedures.setVerticalGroup(
			gl_procedures.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_procedures.createSequentialGroup()
					.addComponent(btnProcedimentos)
					.addGap(8)
					.addComponent(exibeProcedimentos, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
					.addContainerGap())
		);
		procedures.setLayout(gl_procedures);
		
	}
}
