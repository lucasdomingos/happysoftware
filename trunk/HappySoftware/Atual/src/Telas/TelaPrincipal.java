package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SplashScreen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.text.ParseException;


public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				
					
					TelaPrincipal frame = new TelaPrincipal();
					frame.setLocationRelativeTo(null);
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
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Sem t\u00EDtulo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuCadastrar = new JMenu("Cadastrar");
		menuBar.add(menuCadastrar);
		
		JMenu mnNewMenu_1 = new JMenu("Cadastrar");
		menuCadastrar.add(mnNewMenu_1);
		
		JMenuItem cliente = new JMenuItem("Cliente"); // CLIENTES
		cliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 TelaCliente abrir;
				try {
					abrir = new TelaCliente();
					 abrir.setLocationRelativeTo(null);
					 abrir.setVisible(true);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
		});
		mnNewMenu_1.add(cliente);
		
		JMenuItem produto = new JMenuItem("Produtos"); // PRODUTOS 
		produto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaProdutos abrir1 = new TelaProdutos();
				 abrir1.setLocationRelativeTo(null);
				 abrir1.setVisible(true);
			}
		});
		mnNewMenu_1.add(produto);
		
		JMenuItem despesas = new JMenuItem("Depesas");
		despesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaDespesas abrir2 = new TelaDespesas();
				 abrir2.setLocationRelativeTo(null);
				 abrir2.setVisible(true);
			}
		});
		mnNewMenu_1.add(despesas);
		
		JMenuItem vendedor = new JMenuItem("Vendedor");
		vendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaFuncionario abrir3;
				try {
					abrir3 = new TelaFuncionario();
					 abrir3.setLocationRelativeTo(null);
					 abrir3.setVisible(true);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		mnNewMenu_1.add(vendedor);
		
		JMenuItem sair = new JMenuItem("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		menuCadastrar.add(sair);
		
		JMenu mnVendas = new JMenu("Vendas");
		menuBar.add(mnVendas);
		
		JMenuItem mntmVendas = new JMenuItem("Vendas");
		mntmVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					
				TelaVenda abrir = new TelaVenda();
				abrir.setLocationRelativeTo(null);
				abrir.setVisible(true);
				
				}catch(Exception e){
					e.printStackTrace();
				}
			
			}
		});
		mnVendas.add(mntmVendas);
		
		JMenu menuEditar = new JMenu("Editar");
		menuBar.add(menuEditar);
		
		JMenu mnAlterar = new JMenu("Alterar");
		menuEditar.add(mnAlterar);
		
		JMenuItem alteracliente_1 = new JMenuItem("Cliente");
		mnAlterar.add(alteracliente_1);
		
		JMenuItem alteraVendedor_2 = new JMenuItem("Vendedor");
		mnAlterar.add(alteraVendedor_2);
		
		JMenuItem alteraProdutos_1 = new JMenuItem("Produtos");
		mnAlterar.add(alteraProdutos_1);
		
		JMenuItem alteraVendas_1 = new JMenuItem("Vendas");
		mnAlterar.add(alteraVendas_1);
		
		JMenu mnProcurar = new JMenu("Procurar");
		menuBar.add(mnProcurar);
		
		JMenuItem procurarCliente = new JMenuItem("Cliente");
		procurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // PROCURAR
				
				TelaProcurar abrir = new TelaProcurar();
				 abrir.setLocationRelativeTo(null);
				 abrir.setVisible(true);
				
			}
		});
		mnProcurar.add(procurarCliente);
		
		JMenuItem procurarProdutos = new JMenuItem("Produtos");
		procurarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaProcurar abrir = new TelaProcurar();
				 abrir.setLocationRelativeTo(null);
				 abrir.setVisible(true);
			}
		});
		mnProcurar.add(procurarProdutos);
		
		JMenuItem procurarVendedor_1 = new JMenuItem("Vendedor");
		procurarVendedor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaProcurar abrir = new TelaProcurar();
				 abrir.setLocationRelativeTo(null);
				 abrir.setVisible(true);
			}
		});
		mnProcurar.add(procurarVendedor_1);
		
		JMenuItem procurarVendas = new JMenuItem("Vendas");
		procurarVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaProcurar abrir = new TelaProcurar();
				 abrir.setLocationRelativeTo(null);
				 abrir.setVisible(true);
			}
		});
		mnProcurar.add(procurarVendas);
		
		JMenu menuRelatorio = new JMenu("Relatorio");
		menuBar.add(menuRelatorio);
		
		JMenuItem relatorioSimples = new JMenuItem("Relatorio Simples");
		menuRelatorio.add(relatorioSimples);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menuBar.add(menuAjuda);
		
		JMenuItem HappySoftware = new JMenuItem("Happy Software");
		HappySoftware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaAjuda abrir = new TelaAjuda();
				 abrir.setLocationRelativeTo(null);
				 abrir.setVisible(true);
			}
		});
		menuAjuda.add(HappySoftware);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
