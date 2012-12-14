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
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.UIManager;


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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Sem t\u00EDtulo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 356);
		
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
		
		JMenu mnProcurar = new JMenu("Procurar");
		menuBar.add(mnProcurar);
		
		JMenuItem procurarCliente = new JMenuItem("Busca Van\u00E7ada");
		procurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // PROCURAR
				
				TelaProcurar abrir = new TelaProcurar();
				 abrir.setLocationRelativeTo(null);
				 abrir.setVisible(true);
				
			}
		});
		mnProcurar.add(procurarCliente);
		
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
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/Splash.png")));
		lblNewLabel.setBounds(142, 0, 550, 310);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCliente abrir;
				try {
					abrir = new TelaCliente();
					abrir.setLocationRelativeTo(null);
					abrir.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 51, 102));
		btnNewButton.setBounds(10, 47, 122, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Funcion\u00E1rios");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					TelaFuncionario abrir = new TelaFuncionario();
					abrir.setLocationRelativeTo(null);
					abrir.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setForeground(new Color(0, 51, 102));
		btnNewButton_1.setBounds(10, 100, 122, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Produtos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaProdutos abrir = new TelaProdutos();
				abrir.setLocationRelativeTo(null);
				abrir.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(0, 51, 102));
		btnNewButton_2.setBounds(10, 147, 122, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Vendas");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					TelaVenda abrir = new TelaVenda();
					abrir.setLocationRelativeTo(null);
					abrir.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_3.setForeground(new Color(0, 51, 102));
		btnNewButton_3.setBounds(10, 200, 122, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = JOptionPane.showConfirmDialog(null, "Deseja sair do programa ?", "HappySoftware", JOptionPane.YES_NO_OPTION);
				
				if (a == JOptionPane.YES_OPTION){
					System.exit(WIDTH);
				}
				else{
					
				}
				
			}
		});
		btnSair.setBounds(10, 269, 122, 23);
		contentPane.add(btnSair);
	}
}
