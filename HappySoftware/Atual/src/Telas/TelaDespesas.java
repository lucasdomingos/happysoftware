package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import Fachada.Fachada;
import Modelo.Despesa;


public class TelaDespesas extends JFrame {

	private JPanel contentPane;
	private JTextField nomeDespesa;
	private JTextField codigoDespesa;
	private JTextField valorDespesa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDespesas frame = new TelaDespesas();
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
	
	public TelaDespesas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 648, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomeDespesa = new JTextField();
		nomeDespesa.setBounds(10, 76, 434, 20);
		contentPane.add(nomeDespesa);
		nomeDespesa.setColumns(10);
		
		JLabel lblNomeDaDespesa = new JLabel("Nome da despesa");
		lblNomeDaDespesa.setBounds(10, 51, 172, 14);
		contentPane.add(lblNomeDaDespesa);
		
		codigoDespesa = new JTextField();
		codigoDespesa.setBounds(10, 132, 172, 20);
		contentPane.add(codigoDespesa);
		codigoDespesa.setColumns(10);
		
		JLabel lblCod = new JLabel("Cod");
		lblCod.setBounds(10, 107, 46, 14);
		contentPane.add(lblCod);
		
		JLabel lblValorDaDespesa = new JLabel("Valor da despesa");
		lblValorDaDespesa.setBounds(10, 169, 99, 14);
		contentPane.add(lblValorDaDespesa);
		
		valorDespesa = new JTextField();
		valorDespesa.setBounds(10, 194, 172, 20);
		contentPane.add(valorDespesa);
		valorDespesa.setColumns(10);
		
		JButton despesaCancelar = new JButton("Cancelar");
		despesaCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
				
			}
		});
		despesaCancelar.setBounds(532, 341, 100, 23);
		contentPane.add(despesaCancelar);
		
		JButton despesaExcluir = new JButton("Excluir");
		despesaExcluir.setIcon(new ImageIcon(TelaDespesas.class.getResource("/img/cancelar.png")));
		despesaExcluir.setBounds(516, 371, 116, 23);
		contentPane.add(despesaExcluir);
		
		JButton despesaOk = new JButton("Ok");
		despesaOk.setBounds(422, 341, 100, 23);
		contentPane.add(despesaOk);
		
		JButton despesaSalvar = new JButton("Salvar");
		despesaSalvar.setIcon(new ImageIcon(TelaDespesas.class.getResource("/img/salve.png")));
		despesaSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fachada salva = new Fachada();
				Despesa novo = new Despesa();
				
				novo.setNome(nomeDespesa.getText());
				novo.setCodigo(valorDespesa.getText());
				novo.setValor(valorDespesa.getText());
				salva.salvaDespesas(novo);
				limpa();
				
			}
		});
		despesaSalvar.setBounds(390, 371, 116, 23);
		contentPane.add(despesaSalvar);
	}
	
	
	public void limpa(){
		
	
		nomeDespesa.setText("");
	    valorDespesa.setText("");
		valorDespesa.setText("");
		
	}
	
	
}
