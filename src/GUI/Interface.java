package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Dados.BancoDados;

public class Interface extends JFrame {

	private BancoDados olimpiadas = new BancoDados();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 651, 367);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Seleções", null, panel, null);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 11, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 11, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(298, 11, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(394, 11, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 48, 523, 188);
		panel.add(textPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 247, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(106, 247, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(202, 247, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(298, 247, 89, 23);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane.addTab("Jogadores", null, panel_1, null);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 11, 86, 20);
		panel_1.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(106, 11, 86, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(202, 11, 86, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(298, 11, 86, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(394, 11, 86, 20);
		panel_1.add(textField_9);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 48, 523, 188);
		panel_1.add(textPane_1);
		
		JButton button = new JButton("New button");
		button.setBounds(10, 247, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(106, 247, 89, 23);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(202, 247, 89, 23);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(298, 247, 89, 23);
		panel_1.add(button_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Técnicos", null, panel_2, null);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 11, 86, 20);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(106, 11, 86, 20);
		panel_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(202, 11, 86, 20);
		panel_2.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(298, 11, 86, 20);
		panel_2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(394, 11, 86, 20);
		panel_2.add(textField_14);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(10, 48, 523, 188);
		panel_2.add(textPane_2);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(10, 247, 89, 23);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(106, 247, 89, 23);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(202, 247, 89, 23);
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBounds(298, 247, 89, 23);
		panel_2.add(button_7);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Jogos", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextPane tabelaJogos = new JTextPane();
		tabelaJogos.setBounds(10, 46, 626, 282);
		tabelaJogos.setFont(new Font("Calibri", ));
		panel_3.add(tabelaJogos);
		
		JButton btnNewButton_4 = new JButton("Gerar tabela");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabelaJogos.setText(olimpiadas.getTabelaDeJogos());
			}
		});
		btnNewButton_4.setAction(action);
		btnNewButton_4.setBounds(252, 11, 111, 23);
		panel_3.add(btnNewButton_4);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Gerar tabela");
			putValue(SHORT_DESCRIPTION, "Gerar tabela de jogos de futebol das Olimpíadas.");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
