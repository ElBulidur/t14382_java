package br.com.juliopereira.view.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;

import javax.swing.event.AncestorEvent;

public class TelaCompras {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompras window = new TelaCompras();
					window.  frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCompras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 482, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_1.getLayout();
		flowLayout_5.setHgap(15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setHgap(55);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_3 = (FlowLayout) panel_3_1.getLayout();
		flowLayout_3.setHgap(55);
		
		JComboBox cProduto2 = new JComboBox();
		panel_3_1.add(cProduto2);
		
		JLabel lValor2 = new JLabel("R$ 0.00");
		panel_3_1.add(lValor2);
		
		JComboBox cQuantidade2 = new JComboBox();
		cQuantidade2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		panel_3_1.add(cQuantidade2);
		
		JLabel lTotal2 = new JLabel("R$ 0.00");
		panel_3_1.add(lTotal2);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_4 = (FlowLayout) panel_3_2.getLayout();
		flowLayout_4.setHgap(55);
		
		JComboBox cProduto3 = new JComboBox();
		panel_3_2.add(cProduto3);
		
		JLabel lValor3 = new JLabel("R$ 0.00");
		panel_3_2.add(lValor3);
		
		JComboBox cQuantidade3 = new JComboBox();
		panel_3_2.add(cQuantidade3);
		
		JLabel lTotal3 = new JLabel("R$ 0.00");
		panel_3_2.add(lTotal3);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setHgap(15);
		flowLayout_1.setAlignOnBaseline(true);
		flowLayout_1.setAlignment(FlowLayout.TRAILING);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_5.getLayout();
		flowLayout_2.setAlignment(FlowLayout.TRAILING);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 422, Short.MAX_VALUE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 422, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(panel_3_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(panel_3_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
					.addGap(9))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JButton btnVoltar = new JButton("VOLTAR");
		panel_5.add(btnVoltar);
		
		JButton btnFecharCompra = new JButton("FECHAR COMPRA");
		panel_5.add(btnFecharCompra);
		
		JLabel lblNewLabel_9 = new JLabel("TOTAL DA COMPRA:");
		panel_4.add(lblNewLabel_9);
		
		JLabel lSubTotal = new JLabel("New label");
		panel_4.add(lSubTotal);
		
		JComboBox cProduto1 = new JComboBox();
		panel_3.add(cProduto1);
		
		JLabel lValor1 = new JLabel("R$ 0.00");
		panel_3.add(lValor1);
		
		JComboBox cQuantidade1 = new JComboBox();
		cQuantidade1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		panel_3.add(cQuantidade1);
		
		JLabel lTotal1 = new JLabel("R$ 0.00");
		panel_3.add(lTotal1);
		FlowLayout fl_panel_2 = new FlowLayout(FlowLayout.CENTER, 45, 5);
		fl_panel_2.setAlignOnBaseline(true);
		panel_2.setLayout(fl_panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PRODUTO");
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("VALOR");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("QUANTIDADE");
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TOTAL");
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Caixa:");
		panel_1.add(lblNewLabel_1);
		
		JComboBox cCaixa = new JComboBox();
		cCaixa.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04"}));
		panel_1.add(cCaixa);
		
		JLabel lblNewLabel_2 = new JLabel("Funcionário:");
		panel_1.add(lblNewLabel_2);
		
		JComboBox cFuncionario = new JComboBox();
		cFuncionario.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel_1.add(cFuncionario);
		
		JLabel lblNewLabel = new JLabel("Registro de compras");
		panel.add(lblNewLabel);
		frame.getContentPane().setLayout(groupLayout);
	}

}
