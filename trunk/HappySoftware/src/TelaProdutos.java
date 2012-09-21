import java.awt.BorderLayout;
import java.awt.EventQueue;

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


public class TelaProdutos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
	public TelaProdutos() {
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\cadastro.png"));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Vendas.png"));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Procurar.png"));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\kovausk\\workspace\\HappySoftware\\src\\Incones\\Relatorio.png"));
		
		JLabel lblNewLabel = new JLabel("Cadastrar");
		
		JLabel lblNewLabel_1 = new JLabel("Vender");
		
		JLabel lblNewLabel_2 = new JLabel("Procurar");
		
		JLabel lblNewLabel_3 = new JLabel("Relat\u00F3rio");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(49)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_2)
							.addComponent(lblNewLabel_1))
						.addComponent(lblNewLabel_3)))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
					.addGap(1))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
		);
		panel_2.setLayout(null);
		
		JLabel lblCadastroDeProdutos = new JLabel("Cadastro de Produtos");
		lblCadastroDeProdutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeProdutos.setBounds(0, 0, 176, 25);
		panel_2.add(lblCadastroDeProdutos);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do produto");
		lblNomeDoProduto.setBounds(10, 36, 117, 14);
		panel_2.add(lblNomeDoProduto);
		
		textField = new JTextField();
		textField.setBounds(10, 58, 415, 25);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 94, 46, 14);
		panel_2.add(lblMarca);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 119, 220, 25);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCod = new JLabel("COD");
		lblCod.setBounds(237, 94, 46, 14);
		panel_2.add(lblCod);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 119, 185, 25);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor de compra");
		lblValor.setBounds(10, 155, 98, 14);
		panel_2.add(lblValor);
		
		JLabel lblValor_1 = new JLabel("Valor de venda");
		lblValor_1.setBounds(237, 155, 98, 14);
		panel_2.add(lblValor_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 180, 220, 25);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(240, 180, 185, 25);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblQuantidadeEmEstoque = new JLabel("Quantidade em estoque");
		lblQuantidadeEmEstoque.setBounds(10, 216, 166, 14);
		panel_2.add(lblQuantidadeEmEstoque);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 241, 117, 25);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(327, 363, 98, 23);
		panel_2.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(210, 363, 89, 23);
		panel_2.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(39, 363, 89, 23);
		panel_2.add(btnExcluir);
		contentPane.setLayout(gl_contentPane);
	}
}
