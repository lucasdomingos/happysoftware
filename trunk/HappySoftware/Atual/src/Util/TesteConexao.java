package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TesteConexao {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public void  testing() throws SQLException {
		
		// TODO Auto-generated method stub

		
		
		Connection conexao = null;
		String url = "jdbc:mysql://localhost:3306/happy"; //conexão com o banco url 
		String usuario= "root";  //usuario
		String senha ="1";       //senha
		
		try{
			Class.forName("com.mysql.jdbc.Driver"); //carregar o driver 
			conexao = DriverManager.getConnection(url, usuario, senha); //passa url usuario e senha ára conectar com o driver
			System.out.println("Conexão estabelecida com Sucesso!"); //mostra a mensagem ao se conectar 
			
		}catch(ClassNotFoundException cnfe){
			
			JOptionPane.showMessageDialog(null, "Erro no teste de conexão com o banco"); //caso tenha algum erro mesnagem sera mostradaa 
			cnfe.printStackTrace();
		}
	}

}
