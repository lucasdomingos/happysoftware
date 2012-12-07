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


public class TelaProcurar extends JFrame {

	private JPanel contentPane;
	private JTextField procurarNome;
	private JTextField procuraCod;
	private JTextField procuraCpf;
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
		setBounds(100, 100, 606, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setBounds(31, 11, 150, 14);
		contentPane.add(lblNome);
		
		procurarNome = new JTextField();
		procurarNome.setBounds(26, 36, 546, 20);
		contentPane.add(procurarNome);
		procurarNome.setColumns(10);
		
		JLabel lblCod = new JLabel("Codigo");
		lblCod.setBounds(31, 85, 46, 14);
		contentPane.add(lblCod);
		
		procuraCod = new JTextField();
		procuraCod.setBounds(31, 123, 200, 20);
		contentPane.add(procuraCod);
		procuraCod.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(261, 97, 46, 14);
		contentPane.add(lblCpf);
		
		procuraCpf = new JTextField();
		procuraCpf.setBounds(259, 122, 173, 20);
		contentPane.add(procuraCpf);
		procuraCpf.setColumns(10);
		
		botaoOk = new JButton("    Cliente");
		botaoOk.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/pesquisa.png")));
		botaoOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		botaoOk.setBounds(28, 194, 129, 23);
		contentPane.add(botaoOk);
		
		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setIcon(new ImageIcon(TelaProcurar.class.getResource("/img/cancelar.png")));
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
				
			}
		});
		botaoCancelar.setBounds(476, 296, 114, 23);
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
	}
}
