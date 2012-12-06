package Repositorio;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import Modelo.Despesa;
import Util.GerenteConxao;

public class DespesaRepositorio {

	
	
	
	/**
	 * Este metodo salvar o valor da despesa
	 * @param d
	 */
	public void salvaDespesaRepositorio(Despesa d){
	
		Connection salva = GerenteConxao.getConexao();
		PreparedStatement pst = null;
		int ret =0;
		int a=0;
		
		try{
			
			a= Integer.parseInt(d.getCodigo());
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		try {
		
			String sql = "INSERT INTO despesa(nome, codigo, valor) VALUES(?,?,?)";
			pst = (PreparedStatement) salva.prepareStatement(sql);
			
			pst.setString(1, d.getNome());
			pst.setInt(2, a);
			pst.setString(3, d.getValor());
		    ret = pst.executeUpdate();
	}catch (SQLException sqle){
		
		sqle.printStackTrace();
		JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar no banco!");
		
	}
	
	}//FIM do metedo salvar 
	
	
}
