import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Splash.png"));
		label.setBounds(0, 117, 545, 310);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 21, 545, 96);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\cadastro.png"));
		btnNewButton.setBounds(44, 0, 68, 54);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Vendas.png"));
		btnNewButton_1.setBounds(166, 0, 68, 54);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Procurar.png"));
		btnNewButton_2.setBounds(291, 0, 68, 54);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Relatorio.png"));
		btnNewButton_3.setBounds(424, 0, 68, 54);
		panel.add(btnNewButton_3);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBounds(54, 71, 58, 14);
		panel.add(lblCadastro);
		
		JLabel lblVendas = new JLabel("Vendas");
		lblVendas.setBounds(176, 71, 46, 14);
		panel.add(lblVendas);
		
		JLabel lblProcurar = new JLabel("Procurar");
		lblProcurar.setBounds(301, 71, 58, 14);
		panel.add(lblProcurar);
		
		JLabel lblRelatorios = new JLabel("Relatorios");
		lblRelatorios.setBounds(434, 71, 58, 14);
		panel.add(lblRelatorios);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 545, 21);
		contentPane.add(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenu mnProcurar = new JMenu("Procurar");
		menuBar.add(mnProcurar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
	}
}
