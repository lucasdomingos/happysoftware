import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;


public class TelaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionario frame = new TelaFuncionario();
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
	public TelaFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(525, 22, 259, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 11, 239, 468);
		panel.add(editorPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 22, 527, 77);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 0, 35, 35);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBounds(77, 0, 35, 35);
		panel_1.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(150, 0, 35, 35);
		panel_1.add(button_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(219, 0, 35, 35);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setBounds(10, 46, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vendas");
		lblNewLabel_1.setBounds(77, 46, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Procurar");
		lblNewLabel_2.setBounds(150, 46, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Relat\u00F3rio");
		lblNewLabel_3.setBounds(219, 46, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 21);
		contentPane.add(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Novo");
		mnArquivo.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salvar");
		mnArquivo.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cadastrar");
		mnArquivo.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Procurar");
		mnArquivo.add(mntmNewMenuItem_3);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Cliente");
		mnEditar.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Vendedor ");
		mnEditar.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Produto");
		mnEditar.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Despesa");
		mnEditar.add(mntmNewMenuItem_7);
		
		JMenu mnRelatrio = new JMenu("Relat\u00F3rio");
		menuBar.add(mnRelatrio);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Buscar Cliente");
		mnRelatrio.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Buscar Vendedor");
		mnRelatrio.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Buscar Produto");
		mnRelatrio.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Buscar Despesa");
		mnRelatrio.add(mntmNewMenuItem_11);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Ajuda");
		mnAjuda.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Sobre o HappySoftware");
		mnAjuda.add(mntmNewMenuItem_13);
		
		JLabel lblCadastroDeFuncion = new JLabel("Cadastro de Funcion\u00E1rio");
		lblCadastroDeFuncion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeFuncion.setBounds(10, 98, 188, 22);
		contentPane.add(lblCadastroDeFuncion);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 131, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(10, 150, 225, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSobren = new JLabel("Sobrenome");
		lblSobren.setBounds(263, 131, 75, 14);
		contentPane.add(lblSobren);
		
		textField_1 = new JTextField();
		textField_1.setBounds(263, 150, 252, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCod = new JLabel("COD");
		lblCod.setBounds(20, 186, 36, 14);
		contentPane.add(lblCod);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(10, 211, 175, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(263, 186, 39, 14);
		contentPane.add(lblCpf);
		
		textField_3 = new JTextField();
		textField_3.setBounds(263, 213, 252, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(20, 246, 46, 14);
		contentPane.add(lblEndereo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 271, 505, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(20, 307, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(263, 307, 46, 14);
		contentPane.add(lblCidade);
		
		textField_5 = new JTextField();
		textField_5.setBounds(263, 332, 252, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 332, 225, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(10, 368, 103, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblN = new JLabel("N");
		lblN.setBounds(263, 368, 46, 14);
		contentPane.add(lblN);
		
		textField_7 = new JTextField();
		textField_7.setBounds(263, 393, 86, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(10, 393, 121, 25);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(32, 461, 117, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(222, 461, 117, 25);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(355, 462, 117, 25);
		contentPane.add(btnCancelar);
	}
}
