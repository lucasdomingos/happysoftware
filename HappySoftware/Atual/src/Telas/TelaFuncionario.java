package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

import Controlador.FuncionarioControlador;
import Fachada.Fachada;
import Modelo.Funcionario;
import Repositorio.FuncionarioRepositorio;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import java.awt.Color;


@SuppressWarnings({ "serial", "unused" })
public class TelaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField vendedorSobrenome;
	private JTextField vendedorCod;
	private JTextField vendedorNome;
	private JTextField vendedorBairro;
	private JTextField vendedorEndereço;
	private JTextField vendedorCidade;
	private JTextField vendedorN;
	private JTextField vendedorData;
	private JTextField vendedorcpf2;
	private JTextField vendedorfone;

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
	private void fechar(){
		this.dispose();
		}
	
	
	public TelaFuncionario() throws ParseException {
		setResizable(false);
		setTitle("HappySoftware");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 647, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 641, 444);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rios");
		lblFuncionrio.setForeground(new Color(0, 51, 102));
		lblFuncionrio.setBounds(13, 5, 168, 17);
		lblFuncionrio.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel label_1 = new JLabel("Nome");
		label_1.setBounds(13, 30, 45, 14);
		
		vendedorSobrenome = new JTextField();
		vendedorSobrenome.setBounds(347, 55, 278, 20);
		vendedorSobrenome.setColumns(10);
		
		JLabel label_2 = new JLabel("COD");
		label_2.setBounds(13, 82, 28, 14);
		
		vendedorCod = new JTextField();
		vendedorCod.setBounds(13, 107, 238, 20);
		vendedorCod.setColumns(10);
		
		JLabel label_3 = new JLabel("Sobrenome");
		label_3.setBounds(347, 30, 75, 14);
		
		vendedorNome = new JTextField();
		vendedorNome.setBounds(13, 56, 318, 20);
		vendedorNome.setColumns(10);
		
		JLabel label_4 = new JLabel("CPF");
		label_4.setBounds(347, 82, 33, 14);
		
		vendedorBairro = new JTextField();
		vendedorBairro.setBounds(13, 211, 318, 20);
		vendedorBairro.setColumns(10);
		
		JLabel label_5 = new JLabel("Endere\u00E7o");
		label_5.setBounds(13, 138, 80, 14);
		
		JLabel label_6 = new JLabel("Bairro");
		label_6.setBounds(13, 194, 45, 14);
		
		vendedorEndereço = new JTextField();
		vendedorEndereço.setBounds(13, 163, 612, 20);
		vendedorEndereço.setColumns(10);
		
		JLabel label_7 = new JLabel("Cidade");
		label_7.setBounds(347, 194, 57, 14);
		
		vendedorCidade = new JTextField();
		vendedorCidade.setBounds(347, 211, 278, 20);
		vendedorCidade.setColumns(10);
		
		JLabel label_8 = new JLabel("N\u00BA");
		label_8.setBounds(347, 242, 12, 14);
		
		vendedorN = new JTextField();
		vendedorN.setBounds(347, 267, 86, 20);
		vendedorN.setColumns(10);
		
		
		

		
	
		JButton vendedoSalvar = new JButton("Salvar");
		vendedoSalvar.setIcon(new ImageIcon(TelaFuncionario.class.getResource("/img/cadastro.png")));
		vendedoSalvar.setBounds(386, 410, 115, 23);
		vendedoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Funcionario novo = new Funcionario();
				Fachada salva = new Fachada();
				
				novo.setNome(vendedorNome.getText());
				novo.setSobrenome(vendedorSobrenome.getText());
				novo.setCodigo(vendedorCod.getText());
				novo.setCpf(vendedorcpf2.getText());
				novo.setRua(vendedorEndereço.getText());
				novo.setBairro(vendedorBairro.getText());
				novo.setCidade(vendedorCidade.getText());
				novo.setDataNascimento(vendedorData.getText());
				novo.setNumero(vendedorN.getText());
				novo.setFone(vendedorfone.getText());
				salva.salvafuncionario(novo);
				limpa();
			}
		});
		
		JButton vendedorCancelar = new JButton("Cancelar");
		vendedorCancelar.setIcon(new ImageIcon(TelaFuncionario.class.getResource("/img/cancelar.png")));
		vendedorCancelar.setBounds(515, 410, 110, 23);
		vendedorCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
				
			}
		});
		
		JLabel label_9 = new JLabel("Data de Nascimento");
		label_9.setBounds(13, 242, 129, 14);
		contentPane.setLayout(null);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.add(lblFuncionrio);
		panel_2.add(label_1);
		panel_2.add(label_3);
		panel_2.add(vendedorNome);
		panel_2.add(vendedorSobrenome);
		panel_2.add(label_2);
		panel_2.add(label_4);
		panel_2.add(vendedorCod);
		panel_2.add(label_5);
		panel_2.add(vendedorEndereço);
		panel_2.add(label_6);
		panel_2.add(label_7);
		panel_2.add(vendedorBairro);
		panel_2.add(vendedorCidade);
		panel_2.add(label_9);
		panel_2.add(label_8);
		panel_2.add(vendedorN);
		panel_2.add(vendedoSalvar);
		panel_2.add(vendedorCancelar);
		
		MaskFormatter mascara = new MaskFormatter("###-###-###-##");
		JFormattedTextField vendedorCpf1 = new JFormattedTextField(mascara);
		vendedorCpf1.setBounds(347, 107, 278, 20);
		panel_2.add(vendedorCpf1);
		
		vendedorcpf2 = new JTextField();
		vendedorcpf2 = vendedorCpf1;
		vendedorcpf2.setColumns(10);
		panel_2.add(vendedorcpf2);
		
		
		MaskFormatter mascara1 = new MaskFormatter("##/##/####");
		JFormattedTextField venderoData2 = new JFormattedTextField(mascara1);
		venderoData2.setBounds(13, 267, 96, 20);
		panel_2.add(venderoData2);
		
		
		vendedorData = new JTextField();
		vendedorData =  venderoData2;
		vendedorData.setColumns(10);
		panel_2.add(vendedorData);
		
		JLabel lblFone = new JLabel("Fone:");
		lblFone.setBounds(13, 298, 46, 14);
		panel_2.add(lblFone);
		
		MaskFormatter mascara2 = new MaskFormatter("##-####-####");
		JFormattedTextField vendedorfone1 = new JFormattedTextField(mascara2);
		vendedorfone1.setBounds(10, 323, 115, 20);
		panel_2.add(vendedorfone1);
		
		
		vendedorfone = new JTextField();
		vendedorfone = vendedorfone1;
		vendedorfone.setColumns(10);
		panel_2.add(vendedorfone);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(new ImageIcon(TelaFuncionario.class.getResource("/img/salve.png")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada excluir = new Fachada();
				Funcionario delete = new Funcionario();
				
				delete.setCodigo(vendedorCod.getText());
				excluir.Excluirfuncionario(delete);
				
				
			}
		});
		btnDelete.setBounds(9, 410, 114, 23);
		panel_2.add(btnDelete);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada buscar = new Fachada();
				Funcionario pega = new Funcionario();
				
				pega.setCodigo(vendedorCod.getText());
			    buscar.BucarFuncionario(pega);
			    limpa();
				
				vendedorNome.setText(pega.getNome());
				vendedorCod.setText(pega.getCodigo());
				vendedorcpf2.setText(pega.getCpf());
				vendedorEndereço.setText(pega.getRua());
				vendedorBairro.setText(pega.getBairro());
				vendedorCidade.setText(pega.getCidade());
				vendedorData.setText(pega.getDataNascimento());
				vendedorN.setText(pega.getNumero());
				vendedorfone.setText(pega.getFone());
				
			}
		});
		btnBuscar.setIcon(new ImageIcon(TelaFuncionario.class.getResource("/img/pesquisa.png")));
		btnBuscar.setBounds(133, 410, 111, 23);
		panel_2.add(btnBuscar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setIcon(new ImageIcon(TelaFuncionario.class.getResource("/img/editar.png")));
		btnAlterar.setBounds(254, 410, 117, 23);
		panel_2.add(btnAlterar);
		
	}


public void limpa(){
	
	vendedorNome.setText("");
	vendedorSobrenome.setText("");
	vendedorCod.setText("");
	vendedorcpf2.setText("");
	vendedorEndereço.setText("");
	vendedorBairro.setText("");
	vendedorCidade.setText("");
	vendedorData.setText("");
	vendedorN.setText("");
	vendedorfone.setText("");
	
}
}
