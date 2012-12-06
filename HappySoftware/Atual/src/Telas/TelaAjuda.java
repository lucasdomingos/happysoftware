package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class TelaAjuda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAjuda frame = new TelaAjuda();
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
	public TelaAjuda() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 601, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane dtrpnNomeDoProjeto = new JEditorPane();
		dtrpnNomeDoProjeto.setText("Nome do projeto:\r\n \r\nProjeto Happy \u2013 simplicidade e objetividade\r\n\r\nQuem somos: \r\nJess\u00E9, Thuany, Lucas\r\n\r\nObjetivo: \r\nDesenvolver um programa administrativo para empresas de pequeno porte com simplicidade.\r\n\r\nContatos:\r\nhttp://happyprojeto.blogspot.com.br/\r\n\r\nEmail Grupo: projetohappy@googlegroups.com\r\n\r\nEmail dos representantes e desenvolvedores:\r\n\r\njessemarquesads@gmail.com\r\nlucasdomingos3600@gmail.com\r\nthuanyads2010@gmail.com\r\n");
		dtrpnNomeDoProjeto.setToolTipText("");
		dtrpnNomeDoProjeto.setEditable(false);
		dtrpnNomeDoProjeto.setBounds(10, 11, 575, 325);
		contentPane.add(dtrpnNomeDoProjeto);
	}
}
