package Repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import Modelo.Produto;
import Util.GerenteConxao;

public class ProdutoReopositorio {

	
	public  void SalvarProdutoRepositorio(Produto p) throws SQLException{
		
		Connection salva = GerenteConxao.getConexao();
		java.sql.PreparedStatement pst = null;
		
		@SuppressWarnings("unused")
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
	
		
	}//FIM 
	
	
	
	/**
	 * Este metodo altera os os valores do produto 
	 * e salva no banco de dados 
	 * @param p
	 */
	public static void AlterarProdutoRepositorio(Produto p){
		
		
		Connection salva = GerenteConxao.getConexao();
		java.sql.PreparedStatement pst = null;
		
		@SuppressWarnings("unused")
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
			JOptionPane.showMessageDialog(null, "Produto Alterado!");	
			
		}catch(SQLException sqle){
			
			JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar Produto!");
			sqle.printStackTrace();
		}
		
		
		
		
		
	}// Fim do metodo alterar

  
	
	@SuppressWarnings({ "static-access", "unused" })
	public void ExcluirProdutoRepositorio(Produto p){
		
		
		Connection excluir = new GerenteConxao().getConexao();
		PreparedStatement pst = null;
		
		
		int codigo = 0;
		int    ret = 0; 
	
		
		try{
			
		codigo = Integer.parseInt(p.getCod());	
		System.out.println(codigo);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		try{
			String sql ="delete from produto where codigo  = ?";
			pst = (PreparedStatement) excluir.prepareStatement(sql);
			
			pst.setInt(1, codigo);
			ret = pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
		}catch(SQLException sqle){
			
			sqle.printStackTrace();
			JOptionPane.showMessageDialog(null, "Não foi possivel excluir os dados!");
		}
		
		
	}//FIM do metodo excluir 

	
	public void BuscarProdutoRpositorio(Produto p){
		
String pega = p.getCod();
		
		String sql ="select codigo, nome,marca,compra,venda,estoque from produto where codigo = "+pega;

		
		try{
			 Statement st = (Statement) GerenteConxao.getConexao().createStatement();
	            ResultSet pst = st.executeQuery(sql);
	            while (pst.next()) {  
	               p.setNome(pst.getString("nome"));
	               p.setCod(pst.getString("codigo"));
	               p.setMarca(pst.getString("marca"));
	               p.setCompra(pst.getString("compra"));
	               p.setVenda(pst.getString("venda"));
	               p.setEstoque(pst.getString("estoque"));
	            }
	            
	        } catch (SQLException sqle) {
	            sqle.printStackTrace();
	        }
		
		
	}
	
	
	
}
