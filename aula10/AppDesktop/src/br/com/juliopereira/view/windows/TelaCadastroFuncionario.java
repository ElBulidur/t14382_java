package br.com.juliopereira.view.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TelaCadastroFuncionario {

	private JFrame frame;
	private JTextField iNome;
	private JTextField iSetor;
	private JTextField iSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFuncionario window = new TelaCadastroFuncionario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblNewLabel_4 = new JLabel("kasolution.com");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_4)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		panel_2.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("VOLTAR");
		panel_2.add(btnVoltar);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.PAGE_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lblNewLabel_1);
		
		iNome = new JTextField();
		panel_1.add(iNome);
		iNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Setor:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lblNewLabel_2);
		
		iSetor = new JTextField();
		panel_1.add(iSetor);
		iSetor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Salario:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lblNewLabel_3);
		
		iSalario = new JTextField();
		panel_1.add(iSalario);
		iSalario.setColumns(10);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Cadastro de funcionário");
		lblNewLabel.setBackground(new Color(0, 64, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
