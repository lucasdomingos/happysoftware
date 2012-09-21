import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;


public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas frame = new TelaVendas();
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
	public TelaVendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenu mnRelatrio = new JMenu("Procurar");
		menuBar.add(mnRelatrio);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\cadastro.png"));
		btnNewButton.setBounds(21, 0, 35, 35);
		panel.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Vendas.png"));
		button.setBounds(104, 0, 35, 35);
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Procurar.png"));
		button_1.setBounds(183, 0, 35, 35);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Relatorio.png"));
		button_2.setBounds(259, 0, 35, 35);
		panel.add(button_2);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBounds(21, 60, 66, 14);
		panel.add(lblCadastro);
		
		JLabel lblVendas = new JLabel("Vendas");
		lblVendas.setBounds(104, 60, 57, 14);
		panel.add(lblVendas);
		
		JLabel lblProcurar = new JLabel("Procurar");
		lblProcurar.setBounds(183, 60, 66, 14);
		panel.add(lblProcurar);
		
		JLabel lblRelatrio = new JLabel("Relat\u00F3rio");
		lblRelatrio.setBounds(259, 60, 63, 14);
		panel.add(lblRelatrio);
		
		JPanel panel_1 = new JPanel();
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		
		JLabel lblCadastroDasDespesas = new JLabel("Cadastro das Despesas");
		lblCadastroDasDespesas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDasDespesas.setBounds(10, 0, 165, 27);
		panel_2.add(lblCadastroDasDespesas);
		
		JLabel lblNewLabel = new JLabel("COD");
		lblNewLabel.setBounds(10, 52, 100, 14);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 77, 86, 25);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome da despesa");
		lblNewLabel_1.setBounds(10, 108, 165, 14);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 133, 339, 25);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor da despesa");
		lblNewLabel_2.setBounds(10, 164, 111, 14);
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 189, 100, 25);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(293, 350, 100, 23);
		panel_2.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(183, 350, 100, 23);
		panel_2.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(10, 350, 100, 23);
		panel_2.add(btnExcluir);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(1))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
