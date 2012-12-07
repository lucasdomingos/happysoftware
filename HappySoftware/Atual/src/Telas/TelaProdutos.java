package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import Controlador.ProdutoControlador;
import Fachada.Fachada;
import Modelo.*;
import Repositorio.ProdutoReopositorio;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.awt.Color;


@SuppressWarnings({ "unused", "serial" })
public class TelaProdutos extends JFrame {

	private JPanel contentPane;
	private JTextField produtoNome;
	private JTextField produtoMarca;
	private JTextField produtoCod;
	private JTextField produtoCompra;
	private JTextField produtoVenda;
	private JTextField produtoEstoque;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProdutos frame = new TelaProdutos();
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
	
	public TelaProdutos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 480, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 474, 445);
		panel_2.setLayout(null);
		
		JLabel lblCadastroDeProdutos = new JLabel("Produtos");
		lblCadastroDeProdutos.setForeground(new Color(0, 51, 102));
		lblCadastroDeProdutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeProdutos.setBounds(21, 11, 176, 25);
		panel_2.add(lblCadastroDeProdutos);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do produto");
		lblNomeDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeDoProduto.setBounds(31, 47, 117, 14);
		panel_2.add(lblNomeDoProduto);
		
		produtoNome = new JTextField();
		produtoNome.setBounds(31, 69, 415, 20);
		panel_2.add(produtoNome);
		produtoNome.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMarca.setBounds(31, 105, 46, 14);
		panel_2.add(lblMarca);
		
		produtoMarca = new JTextField();
		produtoMarca.setBounds(31, 130, 220, 20);
		panel_2.add(produtoMarca);
		produtoMarca.setColumns(10);
		
		JLabel lblCod = new JLabel("COD");
		lblCod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCod.setBounds(258, 105, 46, 14);
		panel_2.add(lblCod);
		
		produtoCod = new JTextField();
		produtoCod.setBounds(261, 130, 185, 20);
		panel_2.add(produtoCod);
		produtoCod.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor de compra");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor.setBounds(31, 166, 98, 14);
		panel_2.add(lblValor);
		
		JLabel lblValor_1 = new JLabel("Valor de venda");
		lblValor_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor_1.setBounds(258, 166, 98, 14);
		panel_2.add(lblValor_1);
		
		produtoCompra = new JTextField();
		produtoCompra.setBounds(31, 191, 220, 20);
		panel_2.add(produtoCompra);
		produtoCompra.setColumns(10);
		
		produtoVenda = new JTextField();
		produtoVenda.setBounds(261, 191, 185, 20);
		panel_2.add(produtoVenda);
		produtoVenda.setColumns(10);
		
		JLabel lblQuantidadeEmEstoque = new JLabel("Quantidade em estoque");
		lblQuantidadeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantidadeEmEstoque.setBounds(31, 227, 166, 14);
		panel_2.add(lblQuantidadeEmEstoque);
		
		produtoEstoque = new JTextField();
		produtoEstoque.setBounds(31, 252, 117, 20);
		panel_2.add(produtoEstoque);
		produtoEstoque.setColumns(10);
		
		JButton produtoCancelar = new JButton("Cancelar");
		produtoCancelar.setIcon(new ImageIcon(TelaProdutos.class.getResource("/img/cancelar.png")));
		produtoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
			}
		});
		produtoCancelar.setBounds(349, 400, 115, 23);
		panel_2.add(produtoCancelar);
		
		JButton produtoSalvar = new JButton("Salvar");
		produtoSalvar.setIcon(new ImageIcon(TelaProdutos.class.getResource("/img/cadastro.png")));
		produtoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Produto novo = new Produto();
				Fachada salvar = new Fachada();
				
				novo.setNome(produtoNome.getText());
				novo.setMarca(produtoMarca.getText());
				novo.setCod(produtoCod.getText());
				novo.setCompra(produtoCompra.getText());
				novo.setVenda(produtoVenda.getText());
				novo.setEstoque(produtoEstoque.getText());
				
				
				try {
					salvar.salvarProdutos(novo);
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				limpar(); //limpa os campos 
				
			}
		});
		produtoSalvar.setBounds(224, 400, 115, 23);
		panel_2.add(produtoSalvar);
		contentPane.add(panel_2);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(TelaProdutos.class.getResource("/img/salve.png")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada excluir = new Fachada();
				Produto delete = new Produto();
				
				delete.setCod(produtoCod.getText());
				excluir.excluirProduto(delete);
			    limpar();
				
			}
		});
		btnDelete.setBounds(10, 319, 115, 23);
		panel_2.add(btnDelete);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fachada buscar = new Fachada();
				Produto pega = new Produto();
				
				pega.setCod(produtoCod.getText());
				buscar.BuscarProduto(pega);
				
				produtoCod.setText(pega.getCod());
				produtoNome.setText(pega.getNome());
				produtoMarca.setText(pega.getMarca());
				produtoCompra.setText(pega.getCompra());
				produtoVenda.setText(pega.getVenda());
				produtoEstoque.setText(pega.getEstoque());
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(TelaProdutos.class.getResource("/img/pesquisa.png")));
		btnNewButton.setBounds(10, 363, 119, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.setIcon(new ImageIcon(TelaProdutos.class.getResource("/img/editar.png")));
		btnNewButton_1.setBounds(10, 400, 117, 23);
		panel_2.add(btnNewButton_1);
		
		
		
		
	}

	
	public void limpar(){
		
		
		produtoNome.setText("");
		produtoMarca.setText("");
		produtoCod.setText("");
		produtoCompra.setText("");
		produtoVenda.setText("");
		produtoEstoque.setText("");
	}
}
