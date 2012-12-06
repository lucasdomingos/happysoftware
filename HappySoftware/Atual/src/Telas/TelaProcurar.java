package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaProcurar extends JFrame {

	private JPanel contentPane;
	private JTextField procurarNome;
	private JTextField procuraCod;
	private JTextField procuraCpf;
	private JButton botaoOk;
	private JButton botaoCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProcurar frame = new TelaProcurar();
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
	
	public TelaProcurar() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 606, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(26, 61, 46, 14);
		contentPane.add(lblNome);
		
		procurarNome = new JTextField();
		procurarNome.setBounds(21, 86, 546, 20);
		contentPane.add(procurarNome);
		procurarNome.setColumns(10);
		
		JLabel lblCod = new JLabel("Cod");
		lblCod.setBounds(26, 135, 46, 14);
		contentPane.add(lblCod);
		
		procuraCod = new JTextField();
		procuraCod.setBounds(26, 173, 200, 20);
		contentPane.add(procuraCod);
		procuraCod.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(256, 147, 46, 14);
		contentPane.add(lblCpf);
		
		procuraCpf = new JTextField();
		procuraCpf.setBounds(254, 172, 173, 20);
		contentPane.add(procuraCpf);
		procuraCpf.setColumns(10);
		
		botaoOk = new JButton("Ok");
		botaoOk.setBounds(357, 296, 100, 23);
		contentPane.add(botaoOk);
		
		botaoCancelar = new JButton("Cancelar");
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fechar();
				
			}
		});
		botaoCancelar.setBounds(467, 296, 100, 23);
		contentPane.add(botaoCancelar);
	}

}
