package Repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import Modelo.Produto;
import Modelo.Vendas;
import Util.GerenteConxao;

public class VendasRepositorio {

	
	
	
	/**
	 * Este metodo salva no banco de dados 
	 * todos os valores dos atributos da classe 
	 * vendas 
	 * @param v este parametro serve para instancia 
	 * o objeto no metodo salvarRepositorio
	 */
	@SuppressWarnings("unused")
	public static void salvaVendaRepositorio(Vendas v)throws SQLException{
		
		@SuppressWarnings("static-access")
		Connection salva = new GerenteConxao().getConexao();
		PreparedStatement pst = null;
		int ret =0;
		
		String formata = v.getValorunitario();
		String[] valorunitario = formata.split(",");
		String valorunita;
		valorunita = valorunitario[0]+valorunitario[1]+valorunitario[2];
		System.out.println(valorunita);
		
		String formata1 = v.getDesconto();
		String[] valordesconto1 = formata1.split(",");
		String valordesconto;
		valordesconto = valordesconto1[0]+valordesconto1[1]+valordesconto1[2];
		System.out.println(valordesconto);
		
		String formata2 = v.getValorunitario();
		String[] valorufianl = formata.split(",");
		String valofinal;
		valofinal = valorufianl[0]+valorufianl[1]+valorufianl[2];
		System.out.println(valofinal);
		
		
		
		
	try{
		String sql ="INSERT INTO venda(produto, vendedor, cliente, quantidade, desconto, valor, valorfinal ) VALUES(?,?,?,?,?,?,?)"; 	
		pst = (PreparedStatement) salva.prepareStatement(sql);
		
		pst.setString(1, v.getProduto());
		pst.setString(2, v.getVendedor());
		pst.setString(3, v.getCliente());
		pst.setString(4, v.getQuantidade());
		pst.setString(5, valordesconto);
		pst.setString(6, valorunita);
		pst.setString(7, valofinal);
		
		ret = pst.executeUpdate(); 	
		
			JOptionPane.showMessageDialog(null, "Venda Registrado com Sucesso!");	
			
		}catch(SQLException sqle){
			JOptionPane.showMessageDialog(null, "Não foi possivel salvar no banco!");
			sqle.printStackTrace();
		}
		
	}// FIM do metodo salvar 
	
	
	
	
	
	
	
	
	/**
	 * Este metodo exclui os dados do 
	 * modelo produto que estão no banco 
	 * de Dados
	 * @param v parametro do metodo 
	 */
	public void ExcluirVendaRepositorio(Vendas v){
		
		
		@SuppressWarnings("static-access")
		Connection excluir = new GerenteConxao().getConexao();
		PreparedStatement pst = null;
		
		
		@SuppressWarnings("unused")
		int ret = 0;
	
		
		
		
		try{
			
			String sql ="delete from venda where produto  = ?";
			pst = (PreparedStatement) excluir.prepareStatement(sql);
			
			pst.setString(1, v.getProduto());
			ret = pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
		}catch(SQLException sqle){
			
			sqle.printStackTrace();
			JOptionPane.showMessageDialog(null, "Não foi possivel excluir os dados!");
		}
		
	}//FIM do metodo ExcluirVendaRepositorio
	
	
	
	
	
	
	
	
	/**
	 * Este metodo exclui os dados do 
	 * modelo produto que estão no banco 
	 * de Dados
	 * @param v parametro do metodo 
	 */
	public void BuscarVendasRepositorio(Vendas v){
String pega = v.getProduto();
String pega1 = "'"+pega+"'";
	System.out.println(pega1);	
		String sql ="select produto, vendedor, cliente, quantidade, desconto, valor,valorfinal from venda where produto = "+pega1;

		
		try{
			 Statement st = (Statement) GerenteConxao.getConexao().createStatement();
	            ResultSet pst = st.executeQuery(sql);
	            while (pst.next()) {  
	               v.setProduto(pst.getString("produto"));
	               v.setVendedor(pst.getString("vendedor"));
	               v.setCliente(pst.getString("cliente"));
	               v.setQuantidade(pst.getString("quantidade"));
	               v.setDesconto(pst.getString("desconto"));
	               v.setValorunitario(pst.getString("valor"));
	               v.setValorFinal(pst.getString("Valorfinal"));
	               
	            }
	            
	        } catch (SQLException sqle) {
	            sqle.printStackTrace();
	        }
		
		
	}//FIM do metodo buscar 
	
}
