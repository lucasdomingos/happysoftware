package Repositorio;

import java.nio.charset.CodingErrorAction;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import Modelo.Cliente;
import Util.GerenteConxao;

@SuppressWarnings("unused")
public class ClienteRepositorio {


	
	/**Metodo do Repositorio onde salva no banco de 
	 * dado os dados da classe modelo cliente   
	 * @param c
	 */
	
	
	
	
	public void salvarClienteRepositorio(Cliente c){
		
		Connection salva = GerenteConxao.getConexao();
		PreparedStatement pst= null;
		
		int numero=0;
		int codigo=0;
		int ret = 0;
		String nome = c.getNome()+" "+c.getSobrenome();
		
		 String cpf = c.getCpf();
		 String[] cpfformatado = cpf.split("-");
		 String	cpf2 = cpfformatado[0]+cpfformatado[1]+cpfformatado[2]+cpfformatado[3]; 
		 System.out.println(cpf2);
		
	     String telefone = c.getTelefone();
		 String[] telefoneformatado = telefone.split("-");
	     telefone = telefoneformatado[0]+telefoneformatado[1]+telefoneformatado[2];
		 System.out.println(telefone);
		
		
		
		
		
		try {
			
			numero = Integer.parseInt(c.getNumero());
			codigo = Integer.parseInt(c.getCodigo());
		}catch(Exception e){
			
			e.printStackTrace();
		}
		System.out.println(numero+":"+codigo);
		
		try{
			String sql = "INSERT INTO cliente(nome, codigo, cpf, rua, bairro, cidade, n, telefone) VALUES(?,?,?,?,?,?,?,?)";
			pst = (PreparedStatement) salva.prepareStatement(sql);
			
			pst.setString(1, nome);
			pst.setInt(2, codigo);
			pst.setString(3, cpf2);
			pst.setString(4, c.getRua());
			pst.setString(5, c.getBairro());
			pst.setString(6, c.getCidade());
			pst.setInt(7, numero);
			pst.setString(8, telefone);
			
			ret = pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Cliente cadastrado!");	
		}catch(SQLException sqle){
			
			JOptionPane.showMessageDialog(null, "Erro! Não foi possivel cadastrar o Cliente!");
	          sqle.printStackTrace();	
		}
		
		
		
	}//fim do metodo salvarClineteRepositorio  
	
    
	
	/**
	 * Este metodo exclui o os dados
	 * da tabela cliente do banco de de Dados 
	 * @param C
	 */
	public  void ExcluirClienteRepositorio(Cliente c){
		
		
		
		
		@SuppressWarnings({ "static-access" })
		Connection excluir = new GerenteConxao().getConexao();
		PreparedStatement pst = null;
		
		
		int codigo = 0;
		int    ret = 0; 
	
		
		try{
		codigo = Integer.parseInt(c.getCodigo());	
		System.out.println(codigo);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		try{
			String sql ="delete from cliente where codigo  = ?";
			pst = (PreparedStatement) excluir.prepareStatement(sql);
			
			pst.setInt(1, codigo);
			ret = pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
		}catch(SQLException sqle){
			
			sqle.printStackTrace();
			JOptionPane.showMessageDialog(null, "Não foi possivel excluir os dados!");
		}
		
	 }//Fim do metodo excluir 
	
	public void BuscarClienteRpositorio(Cliente c){
		
		String pega = c.getCodigo();
		
		String sql ="select nome,codigo,cpf,rua,bairro,cidade,n,telefone from cliente where codigo = "+pega;

		
		try{
			 Statement st = (Statement) GerenteConxao.getConexao().createStatement();
	            ResultSet pst = st.executeQuery(sql);
	            while (pst.next()) {  
	               c.setNome(pst.getString("nome"));
	               c.setCodigo(pst.getString("codigo"));
	               c.setCpf(pst.getString("cpf"));
	               c.setRua(pst.getString("rua"));
	               c.setBairro(pst.getString("bairro"));
	               c.setCidade(pst.getString("cidade"));
	               c.setNumero(pst.getString("n"));
	               c.setTelefone(pst.getString("telefone"));
	            }
	            
	        } catch (SQLException sqle) {
	            sqle.printStackTrace();
	        }
			
			
			
		
		
	}// FIM do metodo buscar 
	
	
}
