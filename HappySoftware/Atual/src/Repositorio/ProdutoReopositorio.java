package Repositorio;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Produto;
import Util.GerenteConxao;

public class ProdutoReopositorio {

	
	public static void SalvarProduto(Produto p) throws SQLException{
		
		Connection salva = GerenteConxao.getConexao();
		java.sql.PreparedStatement pst = null;
		
		int ret = 0;
		int cod=0;
		int compra=0;  
		int venda=0;
		int estoque=0;
		
		try{
		   
			 cod     = Integer.parseInt(p.getCod());
			 compra  = Integer.parseInt(p.getCompra());
		     venda   = Integer.parseInt(p.getVenda());  
		     estoque = Integer.parseInt(p.getEstoque());
			System.out.println(cod+":"+compra);
			
	   }catch(Exception e){
		   
		   JOptionPane.showMessageDialog(null, "Insira numeros nos campos de numeros!");
	   }
		
		
		 
		
		
		try{
			String sql = "INSERT INTO produto(codigo, nome, marca, compra, venda, estoque ) VALUES(?,?,?,?,?,?)";
			pst = salva.prepareStatement(sql);
			
			
			pst.setInt(1, cod);
			pst.setString(2, p.getNome());
			pst.setString(3, p.getMarca());
			pst.setInt(4, compra);
			pst.setInt(5, venda);
			pst.setInt(6, estoque);
			ret = pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Produto cadastrado!");	
			
		}catch(SQLException sqle){
			
			JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar Produto!");
			sqle.printStackTrace();
		}
	
		
	}
	
	
	public static void AlterarProduto(Produto p){
		
		
		Connection salva = GerenteConxao.getConexao();
		java.sql.PreparedStatement pst = null;
		
		int ret = 0;
		int cod=0;
		int compra=0;  
		int venda=0;
		int estoque=0;
		
		try{
		   
			 cod     = Integer.parseInt(p.getCod());
			 compra  = Integer.parseInt(p.getCompra());
		     venda   = Integer.parseInt(p.getVenda());  
		     estoque = Integer.parseInt(p.getEstoque());
			System.out.println(cod+":"+compra);
			
	   }catch(Exception e){
		   
		   JOptionPane.showMessageDialog(null, "Insira numeros nos campos de numeros!");
	   }
		
		
		 
		
		
		try{
			String sql = "UPDATE SET produto codigo=?, nome=?, marca=?, compra=?, venda=?, estoque=?";
			pst = salva.prepareStatement(sql);
			
			
			pst.setInt(1, cod);
			pst.setString(2, p.getNome());
			pst.setString(3, p.getMarca());
			pst.setInt(4, compra);
			pst.setInt(5, venda);
			pst.setInt(6, estoque);
			ret = pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Produto cadastrado!");	
			
		}catch(SQLException sqle){
			
			JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar Produto!");
			sqle.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
}
