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
import java.awt.Font;
import java.awt.Color;


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
		vendaProduto.setBounds(10, 108, 343, 20);
		contentPane.add(vendaProduto);
		vendaProduto.setColumns(10);
		
		JLabel lblNomeProduto = new JLabel("Nome Produto");
		lblNomeProduto.setBounds(10, 82, 108, 14);
		contentPane.add(lblNomeProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(373, 82, 108, 14);
		contentPane.add(lblQuantidade);
		
		vendaQuantidade = new JTextField();
		vendaQuantidade.setBounds(373, 108, 119, 20);
		contentPane.add(vendaQuantidade);
		vendaQuantidade.setColumns(10);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unit\u00E1rio");
		lblValorUnitrio.setBounds(527, 82, 88, 14);
		contentPane.add(lblValorUnitrio);
		
		
		
		JLabel lblNomeDoVendedor = new JLabel("Nome do vendedor");
		lblNomeDoVendedor.setBounds(10, 148, 108, 14);
		contentPane.add(lblNomeDoVendedor);
		
		vendaVendedor = new JTextField();
		vendaVendedor.setBounds(10, 173, 343, 20);
		contentPane.add(vendaVendedor);
		vendaVendedor.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto");
		lblDesconto.setBounds(373, 148, 88, 14);
		contentPane.add(lblDesconto);
		
		
		
		JLabel lblVelorFinal = new JLabel("Valor Final");
		lblVelorFinal.setBounds(527, 281, 74, 14);
		contentPane.add(lblVelorFinal);
		
		
		
		JButton vendaCancelar = new JButton("Cancelar");
		vendaCancelar.setBounds(552, 362, 129, 23);
		vendaCancelar.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/cancelar.png")));
		vendaCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
				
			}
		});
		contentPane.add(vendaCancelar);
		
		JButton vendaOk = new JButton("Delete");
		vendaOk.setBounds(10, 362, 119, 23);
		vendaOk.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/salve.png")));
		vendaOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada excluir = new Fachada();
				Vendas delete   = new Vendas();
				delete.setProduto(vendaProduto.getText());
				excluir.ExcluirVendas(delete);
				
			}
		});
		contentPane.add(vendaOk);
		
		JButton vendaSalvar = new JButton("Salvar");
		vendaSalvar.setBounds(413, 362, 129, 23);
		vendaSalvar.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/cadastro.png")));
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
		contentPane.add(vendaSalvar);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do cliente");
		lblNomeDoCliente.setBounds(10, 204, 119, 14);
		contentPane.add(lblNomeDoCliente);
		
		vendaCliente = new JTextField();
		vendaCliente.setBounds(10, 229, 343, 20);
		contentPane.add(vendaCliente);
		vendaCliente.setColumns(10);
		
		
		
		MaskFormatter mascara1 = new MaskFormatter("###,###,##");
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascara1);
		formattedTextField_1.setBounds(530, 108, 134, 20);
		contentPane.add(formattedTextField_1);
		
		vendaValorunitario = new JTextField();
		vendaValorunitario = formattedTextField_1;
		contentPane.add(vendaValorunitario);
		vendaValorunitario.setColumns(10);
		
		
		MaskFormatter mascara2 = new MaskFormatter("###,###,##");
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(mascara2);
		formattedTextField_2.setBounds(373, 173, 129, 20);
		contentPane.add(formattedTextField_2);
		
		
		vendaDesconto = new JTextField();
		vendaDesconto = formattedTextField_2;
		contentPane.add(vendaDesconto);
		vendaDesconto.setColumns(10);
		
		
		MaskFormatter mascara3 = new MaskFormatter("###,###,##");
		JFormattedTextField formattedTextField_3 = new JFormattedTextField(mascara3);
		formattedTextField_3.setBounds(527, 306, 134, 20);
		contentPane.add(formattedTextField_3);
		
		vendaValorFinal = new JTextField();
		vendaValorFinal = formattedTextField_3;
		contentPane.add(vendaValorFinal);
		vendaValorFinal.setColumns(10);
		
		JLabel lblVendas = new JLabel("Vendas");
		lblVendas.setBounds(10, 11, 108, 36);
		lblVendas.setForeground(new Color(0, 51, 102));
		lblVendas.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblVendas);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBounds(284, 362, 119, 23);
		btnNewButton.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/editar.png")));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(145, 362, 129, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fachada buscar = new Fachada();
				Vendas pega = new Vendas();
				
				pega.setProduto(vendaProduto.getText());
				buscar.BuscarVendas(pega);
				
				vendaProduto.setText(pega.getProduto());
				vendaCliente.setText(pega.getCliente());
				vendaVendedor.setText(pega.getVendedor());
				vendaQuantidade.setText(pega.getQuantidade());
				vendaDesconto.setText(pega.getDesconto());
				vendaValorunitario.setText(pega.getValorunitario());
				vendaValorFinal.setText(pega.getValorFinal());
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/pesquisa.png")));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gerar Pdf");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(TelaVenda.class.getResource("/img/pdf.png")));
		btnNewButton_2.setBounds(552, 20, 129, 23);
		contentPane.add(btnNewButton_2);
		
		
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
