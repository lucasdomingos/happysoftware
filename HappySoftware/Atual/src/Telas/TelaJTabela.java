package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import Fachada.Fachada;
import Modelo.Cliente;

public class TelaJTabela extends JFrame {

	private DefaultTableModel porra;
	private JPanel contentPane;
	private JTable table;
	String a = "ftzetdtg";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJTabela frame = new TelaJTabela();
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
	public TelaJTabela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		porra = new DefaultTableModel( new Object[][]{},new Object[]{"Nome", "Codigo", "cpf", "rua", "bairro", "cidade", "data", "numero", "fone"});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 29, 554, 222);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		table.setModel(porra);
	}

 public void caralho(){
	 String es;
	 Fachada pega = new Fachada();
	 Cliente c = new Cliente();
	 
	 for(Cliente c1: pega.BuscarCliente()c.equals(obj)){
		 porra.addRow(c1.getNome(), c1.getCodigo(), c1.ge);
	 }
	 
 }
}
