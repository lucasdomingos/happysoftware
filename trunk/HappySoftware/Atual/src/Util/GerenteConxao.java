package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class GerenteConxao {

	/**
	 * @param args
	 */
	public static Connection getConexao() {
		
		
		
		Connection conexao = null;
		String url = "jdbc:mysql://localhost:3306/happy";
		String usuario = "root";
		String senha = "1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(url, usuario, senha);
		System.out.println("Conex�o estabelecida!");
		}catch(ClassNotFoundException cnfe){
		
			JOptionPane.showMessageDialog(null, "Erro na conex�o");
			
			cnfe.printStackTrace();
		}catch( SQLException sqle){
			
			JOptionPane.showMessageDialog(null,"N�o foi possivel concetar");
			sqle.printStackTrace();
		}
		
		
		
		return conexao;
		
		
		
}
}