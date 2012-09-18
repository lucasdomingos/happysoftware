import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JEditorPane;


public class TelaPrograma {

	private JFrame frmHappySoftware;
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
					TelaPrograma window = new TelaPrograma();
					window.frmHappySoftware.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrograma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHappySoftware = new JFrame();
		frmHappySoftware.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmHappySoftware.setTitle("Happy Software");
		frmHappySoftware.setBounds(100, 100, 800, 550);
		frmHappySoftware.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmHappySoftware.setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmNovo = new JMenuItem("Novo");
		mnArquivo.add(mntmNovo);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar ");
		mnArquivo.add(mntmCadastrar);
		
		JMenuItem mntmProcurar = new JMenuItem("Procurar");
		mnArquivo.add(mntmProcurar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmAlterarCliente = new JMenuItem("Cliente");
		mnEditar.add(mntmAlterarCliente);
		
		JMenuItem mntmVendedor = new JMenuItem("Vendedor");
		mnEditar.add(mntmVendedor);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mnEditar.add(mntmProduto);
		
		JMenuItem mntmDespesa = new JMenuItem("Despesa");
		mnEditar.add(mntmDespesa);
		
		JMenu mnAjuda = new JMenu("Relatorio");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmBuscarCliente = new JMenuItem("Buscar Cliente");
		mnAjuda.add(mntmBuscarCliente);
		
		JMenuItem mntmBuscarVendedor = new JMenuItem("Buscar Vendedor");
		mnAjuda.add(mntmBuscarVendedor);
		
		JMenuItem mntmBuscarProduto = new JMenuItem("Buscar Produto");
		mnAjuda.add(mntmBuscarProduto);
		
		JMenuItem mntmBuscarDespesa = new JMenuItem("Buscar Despesa");
		mnAjuda.add(mntmBuscarDespesa);
		
		JMenu mnAjuda_1 = new JMenu("Ajuda");
		menuBar.add(mnAjuda_1);
		
		JMenuItem mntmManualDeAjuda = new JMenuItem("Ajuda");
		mnAjuda_1.add(mntmManualDeAjuda);
		
		JMenuItem mntmSobreOHappy = new JMenuItem("Sobre o HappySoftware ");
		mnAjuda_1.add(mntmSobreOHappy);
		frmHappySoftware.getContentPane().setLayout(null);
		
		JLabel lblCadastrarCliente = new JLabel("Cadastro de Cliente");
		lblCadastrarCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCadastrarCliente.setBounds(12, 78, 188, 22);
		frmHappySoftware.getContentPane().add(lblCadastrarCliente);
		
		JLabel lblCod = new JLabel("COD:");
		lblCod.setBounds(12, 166, 42, 15);
		frmHappySoftware.getContentPane().add(lblCod);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(12, 186, 171, 23);
		frmHappySoftware.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNme = new JLabel("Nome");
		lblNme.setBounds(12, 106, 70, 15);
		frmHappySoftware.getContentPane().add(lblNme);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 129, 246, 23);
		frmHappySoftware.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(277, 106, 107, 15);
		frmHappySoftware.getContentPane().add(lblSobrenome);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 129, 238, 23);
		frmHappySoftware.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(277, 166, 70, 15);
		frmHappySoftware.getContentPane().add(lblCpf);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 186, 238, 23);
		frmHappySoftware.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(12, 222, 70, 15);
		frmHappySoftware.getContentPane().add(lblEndereo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(12, 244, 503, 23);
		frmHappySoftware.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(12, 281, 70, 15);
		frmHappySoftware.getContentPane().add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(277, 281, 70, 15);
		frmHappySoftware.getContentPane().add(lblCidade);
		
		textField_5 = new JTextField();
		textField_5.setBounds(277, 308, 238, 23);
		frmHappySoftware.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(12, 308, 246, 23);
		frmHappySoftware.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(12, 334, 160, 15);
		frmHappySoftware.getContentPane().add(lblDataDeNascimento);
		
		textField_7 = new JTextField();
		textField_7.setBounds(12, 357, 150, 23);
		frmHappySoftware.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(294, 437, 117, 25);
		frmHappySoftware.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(165, 437, 117, 25);
		frmHappySoftware.getContentPane().add(btnSalvar);
		
		JButton btnLimpar = new JButton("Excluir");
		btnLimpar.setBounds(10, 437, 117, 25);
		frmHappySoftware.getContentPane().add(btnLimpar);
		
		JLabel lblN = new JLabel("N");
		lblN.setBounds(188, 334, 70, 15);
		frmHappySoftware.getContentPane().add(lblN);
		
		textField_8 = new JTextField();
		textField_8.setBounds(188, 357, 100, 23);
		frmHappySoftware.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(525, 0, 259, 491);
		frmHappySoftware.getContentPane().add(panel);
		panel.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBounds(10, 5, 239, 475);
		panel.add(editorPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 526, 77);
		frmHappySoftware.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setBounds(10, 52, 48, 14);
		panel_1.add(lblCadastrar);
		
		JLabel lblVendas = new JLabel("Vendas");
		lblVendas.setBounds(80, 52, 46, 14);
		panel_1.add(lblVendas);
		
		JLabel lblProcurar = new JLabel("Procurar");
		lblProcurar.setBounds(146, 52, 46, 14);
		panel_1.add(lblProcurar);
		
		JLabel lblRelatrio = new JLabel("Relat\u00F3rio");
		lblRelatrio.setBounds(219, 52, 46, 14);
		panel_1.add(lblRelatrio);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 0, 35, 35);
		panel_1.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBounds(77, 0, 35, 35);
		panel_1.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(150, 0, 35, 35);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(219, 0, 35, 35);
		panel_1.add(button_2);
	}
}
