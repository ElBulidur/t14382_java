package br.com.juliopereira.view.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import br.com.juliopereira.model.EUnidadeProduto;

public class TelaCadastroProduto {

	private JFrame frame;
	private JTextField iNome;
	private JTextField iCodigo;
	private JTextField iValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProduto window = new TelaCadastroProduto();
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
	public TelaCadastroProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 251, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 220, SpringLayout.WEST, frame.getContentPane());
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Produtos");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 59, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -119, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 220, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1);
		
		iNome = new JTextField();
		panel_1.add(iNome);
		iNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_2);
		
		iCodigo = new JTextField();
		panel_1.add(iCodigo);
		iCodigo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Unidade");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_3);
		
		JComboBox cUnidade = new JComboBox();
		cUnidade.setModel(new DefaultComboBoxModel(EUnidadeProduto.values()));
		panel_1.add(cUnidade);
		
		JLabel lblNewLabel_4 = new JLabel("Valor:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_4);
		
		iValor = new JTextField();
		panel_1.add(iValor);
		iValor.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 70, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		panel_2.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("VOLTAR");
		panel_2.add(btnVoltar);
		
		JLabel lblNewLabel_5 = new JLabel("kasolution.com.br");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 6, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_5, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, 39, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_5, 0, SpringLayout.EAST, panel);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
