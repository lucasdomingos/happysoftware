package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import Controlador.VendasControlador;
import Fachada.Fachada;
import Modelo.Vendas;
import Repositorio.VendasRepositorio;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Vector;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;


@SuppressWarnings({ "serial", "unused" })
public class TelaVenda extends JFrame {

	private JPanel contentPane;
	private JTextField vendaProduto;
	private JTextField vendaQuantidade;
	private JTextField vendaValorunitario;
	private JTextField vendaVendedor;
	private JTextField vendaDesconto;
	private JTextField vendaValorFinal;
	private JTextField vendaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVenda frame = new TelaVenda();
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
	
	
	public TelaVenda() throws ParseException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 702, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		vendaProduto = new JTextField();
		vendaProduto.setBounds(10, 84, 343, 20);
		contentPane.add(vendaProduto);
		vendaProduto.setColumns(10);
		
		JLabel lblNomeProduto = new JLabel("Nome Produto");
		lblNomeProduto.setBounds(10, 58, 108, 14);
		contentPane.add(lblNomeProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(373, 58, 108, 14);
		contentPane.add(lblQuantidade);
		
		vendaQuantidade = new JTextField();
		vendaQuantidade.setBounds(373, 84, 119, 20);
		contentPane.add(vendaQuantidade);
		vendaQuantidade.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unit\u00E1rio");
		lblValorUnitrio.setBounds(527, 58, 88, 14);
		contentPane.add(lblValorUnitrio);
		
		
		
		JLabel lblNomeDoVendedor = new JLabel("Nome do vendedor");
		lblNomeDoVendedor.setBounds(10, 124, 108, 14);
		contentPane.add(lblNomeDoVendedor);
		
		vendaVendedor = new JTextField();
		vendaVendedor.setBounds(10, 149, 343, 20);
		contentPane.add(vendaVendedor);
		vendaVendedor.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto");
		lblDesconto.setBounds(373, 124, 88, 14);
		contentPane.add(lblDesconto);
		
		
		
		JLabel lblVelorFinal = new JLabel("Valor Final");
		lblVelorFinal.setBounds(527, 257, 74, 14);
		contentPane.add(lblVelorFinal);
		
		
		
		JButton vendaCancelar = new JButton("Cancelar");
		vendaCancelar.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/cancelar.png")));
		vendaCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
				
			}
		});
		vendaCancelar.setBounds(552, 362, 129, 23);
		contentPane.add(vendaCancelar);
		
		JButton vendaOk = new JButton("Ok");
		vendaOk.setBounds(464, 328, 100, 23);
		contentPane.add(vendaOk);
		
		JButton vendaSalvar = new JButton("Salvar");
		vendaSalvar.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/salve.png")));
		vendaSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Vendas novo = new Vendas();
				Fachada salva = new Fachada();
				
				novo.setProduto(vendaProduto.getText());
				novo.setQuantidade(vendaQuantidade.getText());
				novo.setValorunitario(vendaValorunitario.getText());
				novo.setVendedor(vendaVendedor.getText());
				novo.setDesconto(vendaDesconto.getText());
				novo.setValorFinal(vendaValorFinal.getText());
				novo.setCliente(vendaCliente.getText());
				
			
				
				try {
					salva.SalvaVendas(novo);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				limpa();
				
			}
		});
		vendaSalvar.setBounds(407, 362, 129, 23);
		contentPane.add(vendaSalvar);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do cliente");
		lblNomeDoCliente.setBounds(10, 180, 119, 14);
		contentPane.add(lblNomeDoCliente);
		
		vendaCliente = new JTextField();
		vendaCliente.setBounds(10, 205, 343, 20);
		contentPane.add(vendaCliente);
		vendaCliente.setColumns(10);
		
		
		
		MaskFormatter mascara1 = new MaskFormatter("###,###,##");
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascara1);
		formattedTextField_1.setBounds(530, 84, 134, 20);
		contentPane.add(formattedTextField_1);
		
		vendaValorunitario = new JTextField();
		vendaValorunitario = formattedTextField_1;
		vendaValorunitario.setBounds(530, 84, 134, 20);
		contentPane.add(vendaValorunitario);
		vendaValorunitario.setColumns(10);
		
		
		MaskFormatter mascara2 = new MaskFormatter("###,###,##");
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(mascara2);
		formattedTextField_2.setBounds(373, 149, 129, 20);
		contentPane.add(formattedTextField_2);
		
		
		vendaDesconto = new JTextField();
		vendaDesconto = formattedTextField_2;
		vendaDesconto.setBounds(373, 149, 129, 20);
		contentPane.add(vendaDesconto);
		vendaDesconto.setColumns(10);
		
		
		MaskFormatter mascara3 = new MaskFormatter("###,###,##");
		JFormattedTextField formattedTextField_3 = new JFormattedTextField(mascara3);
		formattedTextField_3.setBounds(527, 282, 134, 20);
		contentPane.add(formattedTextField_3);
		
		vendaValorFinal = new JTextField();
		vendaValorFinal = formattedTextField_3;
		vendaValorFinal.setBounds(527, 282, 134, 20);
		contentPane.add(vendaValorFinal);
		vendaValorFinal.setColumns(10);
		
		
	}
     
	
	public void limpa(){
		
		vendaProduto.setText("");
		vendaQuantidade.setText("");
		vendaValorunitario.setText("");
		vendaVendedor.setText("");
		vendaDesconto.setText("");
		vendaValorFinal.setText("");
		vendaCliente.setText("");
		
		
	}

}
