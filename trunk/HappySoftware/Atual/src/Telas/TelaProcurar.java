package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;


public class TelaProcurar extends JFrame {

	private JPanel contentPane;
	private JButton botaoOk;
	private JButton botaoCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProcurar frame = new TelaProcurar();
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
	private void fechar(){
		this.dispose();
		}
	
	public TelaProcurar() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 321, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botaoOk = new JButton("    Cliente");
		botaoOk.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/pesquisa.png")));
		botaoOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		botaoOk.setBounds(28, 188, 129, 23);
		contentPane.add(botaoOk);
		
		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/cancelar.png")));
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
				
			}
		});
		botaoCancelar.setBounds(191, 296, 114, 23);
		contentPane.add(botaoCancelar);
		
		JButton btnVendedor = new JButton("Vendedor");
		btnVendedor.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/pesquisa.png")));
		btnVendedor.setBounds(28, 228, 129, 23);
		contentPane.add(btnVendedor);
		
		JButton btnVenda = new JButton("     Venda");
		btnVenda.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/pesquisa.png")));
		btnVenda.setBounds(28, 262, 129, 23);
		contentPane.add(btnVenda);
		
		JButton btnProduto = new JButton("  Produto");
		btnProduto.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/pesquisa.png")));
		btnProduto.setBounds(28, 296, 129, 23);
		contentPane.add(btnProduto);
		
		JLabel lblNewLabel = new JLabel("Lista todos os intes cadastrados");
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 95, 305, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/teste.png")));
		lblNewLabel_1.setBounds(0, 0, 317, 79);
		contentPane.add(lblNewLabel_1);
	}
}
