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
		frmHappySoftware.setBounds(100, 100, 800, 450);
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
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnArquivo.add(mntmSair);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenu mnAjuda = new JMenu("Relatorio");
		menuBar.add(mnAjuda);
		
		JMenu mnAjuda_1 = new JMenu("Ajuda");
		menuBar.add(mnAjuda_1);
		frmHappySoftware.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(12, 12, 100, 30);
		frmHappySoftware.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(141, 12, 100, 30);
		frmHappySoftware.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(267, 12, 100, 30);
		frmHappySoftware.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(396, 12, 100, 30);
		frmHappySoftware.getContentPane().add(btnNewButton_3);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setBounds(12, 54, 85, 15);
		frmHappySoftware.getContentPane().add(lblCadastrar);
		
		JLabel lblVendas = new JLabel("Vendas");
		lblVendas.setBounds(151, 54, 70, 15);
		frmHappySoftware.getContentPane().add(lblVendas);
		
		JLabel lblNewLabel = new JLabel("Procurar");
		lblNewLabel.setBounds(277, 54, 70, 15);
		frmHappySoftware.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Relatório");
		lblNewLabel_1.setBounds(406, 54, 70, 15);
		frmHappySoftware.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCadastrarCliente = new JLabel("Cadastro de Cliente");
		lblCadastrarCliente.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCadastrarCliente.setBounds(12, 78, 188, 22);
		frmHappySoftware.getContentPane().add(lblCadastrarCliente);
		
		JLabel lblCod = new JLabel("COD:");
		lblCod.setBounds(12, 172, 42, 15);
		frmHappySoftware.getContentPane().add(lblCod);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(12, 192, 171, 23);
		frmHappySoftware.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNme = new JLabel("Nome");
		lblNme.setBounds(12, 112, 70, 15);
		frmHappySoftware.getContentPane().add(lblNme);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 135, 246, 23);
		frmHappySoftware.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(277, 112, 107, 15);
		frmHappySoftware.getContentPane().add(lblSobrenome);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 135, 238, 23);
		frmHappySoftware.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(277, 172, 70, 15);
		frmHappySoftware.getContentPane().add(lblCpf);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 192, 238, 23);
		frmHappySoftware.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(12, 228, 70, 15);
		frmHappySoftware.getContentPane().add(lblEndereo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(12, 250, 503, 23);
		frmHappySoftware.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(12, 287, 70, 15);
		frmHappySoftware.getContentPane().add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(277, 287, 70, 15);
		frmHappySoftware.getContentPane().add(lblCidade);
		
		textField_5 = new JTextField();
		textField_5.setBounds(277, 314, 238, 23);
		frmHappySoftware.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(12, 314, 246, 23);
		frmHappySoftware.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(12, 340, 160, 15);
		frmHappySoftware.getContentPane().add(lblDataDeNascimento);
		
		textField_7 = new JTextField();
		textField_7.setBounds(12, 363, 150, 23);
		frmHappySoftware.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(659, 361, 117, 25);
		frmHappySoftware.getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(530, 361, 117, 25);
		frmHappySoftware.getContentPane().add(btnSalvar);
		
		JButton btnLimpar = new JButton("Excluir");
		btnLimpar.setBounds(375, 361, 117, 25);
		frmHappySoftware.getContentPane().add(btnLimpar);
		
		JLabel lblN = new JLabel("N");
		lblN.setBounds(188, 340, 70, 15);
		frmHappySoftware.getContentPane().add(lblN);
		
		textField_8 = new JTextField();
		textField_8.setBounds(188, 365, 100, 23);
		frmHappySoftware.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("logomarca");
		lblNewLabel_2.setBounds(521, 12, 255, 325);
		frmHappySoftware.getContentPane().add(lblNewLabel_2);
	}
}
