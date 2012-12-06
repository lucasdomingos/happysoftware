package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.charset.CodingErrorAction;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;

import Fachada.Fachada;
import Modelo.Cliente;
import Repositorio.ClienteRepositorio;


@SuppressWarnings({ "serial", "unused" })
public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField clienteSbrenome;
	private JTextField clienteNome;
	private JTextField clienteCpf;
	private JTextField codCliente;
	private JTextField clienteEndereco;
	private JTextField clienteCidade;
	private JTextField clienteBairro;
	private JTextField clienteN;
	private JTextField clienteTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	
	
	public TelaCliente() throws ParseException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 653, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeClientes = new JLabel("Cadastro de CLientes");
		lblCadastroDeClientes.setBounds(10, 11, 170, 26);
		lblCadastroDeClientes.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblCadastroDeClientes);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 53, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(352, 53, 96, 14);
		contentPane.add(lblSobrenome);
		
		clienteSbrenome = new JTextField();
		clienteSbrenome.setBounds(352, 78, 268, 20);
		contentPane.add(clienteSbrenome);
		clienteSbrenome.setColumns(10);
		
		clienteNome = new JTextField();
		clienteNome.setBounds(10, 78, 303, 20);
		contentPane.add(clienteNome);
		clienteNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cod");
		lblNewLabel.setBounds(10, 109, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(352, 109, 46, 14);
		contentPane.add(lblCpf);
		
		
		
		
		codCliente = new JTextField();
		codCliente.setBounds(10, 134, 303, 20);
		contentPane.add(codCliente);
		codCliente.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 165, 81, 14);
		contentPane.add(lblEndereo);
		
		clienteEndereco = new JTextField();
		clienteEndereco.setBounds(10, 190, 610, 20);
		contentPane.add(clienteEndereco);
		clienteEndereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro ");
		lblBairro.setBounds(10, 221, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(352, 221, 46, 14);
		contentPane.add(lblCidade);
		
		clienteCidade = new JTextField();
		clienteCidade.setBounds(352, 246, 268, 20);
		contentPane.add(clienteCidade);
		clienteCidade.setColumns(10);
		
		clienteBairro = new JTextField();
		clienteBairro.setBounds(10, 246, 303, 20);
		contentPane.add(clienteBairro);
		clienteBairro.setColumns(10);
		
		JLabel lblN = new JLabel("N");
		lblN.setBounds(10, 277, 46, 14);
		contentPane.add(lblN);
		
		clienteN = new JTextField();
		clienteN.setBounds(10, 302, 86, 20);
		contentPane.add(clienteN);
		clienteN.setColumns(10);
		
		JButton clienteCancelar = new JButton("cencelar");
		clienteCancelar.setIcon(new ImageIcon(TelaCliente.class.getResource("/img/cancelar.png")));
		clienteCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
			}
		});
		clienteCancelar.setBounds(518, 357, 119, 23);
		contentPane.add(clienteCancelar);
		
		JButton clienteSalvar = new JButton("Savar");
		clienteSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada salva = new Fachada();
				Cliente novo = new Cliente();
				
				
				novo.setNome(clienteNome.getText());
				novo.setSobrenome(clienteSbrenome.getText());
				novo.setCodigo(codCliente.getText());
				novo.setCpf(clienteCpf.getText());
				novo.setRua(clienteEndereco.getText());
				novo.setCidade(clienteCidade.getText());
				novo.setBairro(clienteBairro.getText());
				novo.setTelefone(clienteTelefone.getText());
				novo.setNumero(clienteN.getText());
				
				salva.salvaCliente(novo);
				
				limpa();
			}
		});
		clienteSalvar.setIcon(new ImageIcon(TelaCliente.class.getResource("/img/salve.png")));
		clienteSalvar.setBounds(389, 357, 119, 23);
		contentPane.add(clienteSalvar);
		
		
		MaskFormatter mascara = new MaskFormatter("###-###-###-##");
		JFormattedTextField formattedTextField = new JFormattedTextField(mascara);
		formattedTextField.setBounds(352, 134, 268, 20);
		contentPane.add(formattedTextField);
		
		
		clienteCpf = new JTextField();
		clienteCpf = formattedTextField;
		clienteCpf.setBounds(352, 134, 268, 20);
		contentPane.add(clienteCpf);
		clienteCpf.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone:");
		lblFone.setBounds(134, 277, 46, 14);
		contentPane.add(lblFone);
		
		MaskFormatter mascara1= new MaskFormatter("##-####-####");
		JFormattedTextField formatotelefone = new JFormattedTextField(mascara1);
		formatotelefone.setBounds(133, 302, 119, 20);
		contentPane.add(formatotelefone);
		
		clienteTelefone = new JTextField();
		clienteTelefone = formatotelefone;
		clienteTelefone.setBounds(134, 302, 118, 20);
		contentPane.add(clienteTelefone);
		clienteTelefone.setColumns(10);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada excluir = new Fachada();
				Cliente delete = new Cliente();
				
				delete.setCodigo(codCliente.getText());
				excluir.ExcluirCliente(delete);
				
				limpa();
			}
		});
		btnDeletar.setBounds(10, 357, 109, 23);
		contentPane.add(btnDeletar);
	}
	
	
	/**
	 * @throws
	 * Metodo para limpar so valores dos atributos 
	 * para um novo cadastro
	 */
	public void limpa(){
		
	
		clienteNome.setText("");
		clienteSbrenome.setText("");
		codCliente.setText("");
		clienteCpf.setText("");
		clienteEndereco.setText("");
	    clienteCidade.setText("");
		clienteBairro.setText("");
		clienteTelefone.setText("");
		clienteN.setText("");
		
	}
}
