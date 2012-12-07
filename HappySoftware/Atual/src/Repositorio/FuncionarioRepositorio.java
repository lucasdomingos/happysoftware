package Repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import Controlador.VendasControlador;
import Modelo.Cliente;
import Modelo.Funcionario;
import Util.GerenteConxao;

@SuppressWarnings("unused")
public class FuncionarioRepositorio {

	
	
	
	public  void salvaFuncionarioRepositorio(Funcionario f){
		
		Connection salva = GerenteConxao.getConexao();
		PreparedStatement pst = null;
		
		int ret =0;
		int codigo=0;
		int numero=0;
		String nome =f.getNome()+" "+f.getSobrenome();
		String data = f.getDataNascimento();
		
		String[] dataformatada = data.split("/");
		data = dataformatada[0]+dataformatada[1]+dataformatada[2];
		
		 String cpf = f.getCpf();
		 String[] cpfformatado = cpf.split("-");
		 String	cpf2 = cpfformatado[0]+cpfformatado[1]+cpfformatado[2]+cpfformatado[3]; 
		 System.out.println(cpf2);
		
	     String telefone = f.getFone();
		 String[] telefoneformatado = telefone.split("-");
	     telefone = telefoneformatado[0]+telefoneformatado[1]+telefoneformatado[2];
		 System.out.println(telefone);
		
		 
		 
		try{
			
			codigo = Integer.parseInt(f.getCodigo());
		    numero = Integer.parseInt(f.getNumero());
		    
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		try{
			String sql = "INSERT INTO funcionario(nome, codigo, cpf, rua, bairro, cidade, data, n, fone) VALUES(?,?,?,?,?,?,?,?,?)";
			pst = (PreparedStatement) salva.prepareStatement(sql);
			
			
			pst.setString(1, nome);
			pst.setInt(2, codigo);
			pst.setString(3, cpf2);
			pst.setString(4, f.getRua());
			pst.setString(5, f.getBairro());
			pst.setString(6, f.getCidade());
			pst.setString(7, data);
			pst.setInt(8, numero);
			pst.setString(9, telefone);
			
			ret = pst.executeUpdate();
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado!");	
		}catch(SQLException sqle){
			JOptionPane.showMessageDialog(null, "Erro não foi possivel cadastrar Funcionario!");
			sqle.printStackTrace();
		}  
		
		
	}//fim do metodo 
	
	
	@SuppressWarnings("static-access")
	public  void ExcluiFuncionarioRepositorio(Funcionario f){
		
		
		
		Connection excluir = new GerenteConxao().getConexao();
		PreparedStatement pst = null;
		
		
		int codigo = 0;
		int    ret = 0; 
	
		
		try{
		codigo = Integer.parseInt(f.getCodigo());	
		System.out.println(codigo);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		try{
			String sql ="delete from funcionario where codigo  = ?";
			pst = (PreparedStatement) excluir.prepareStatement(sql);
			
			pst.setInt(1, codigo);
			ret = pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
		}catch(SQLException sqle){
			
			sqle.printStackTrace();
			JOptionPane.showMessageDialog(null, "Não foi possivel excluir os dados!");
		}
		
	}//FIM do metodo excluir 
	
	
public void BuscarClienteRpositorio(Funcionario f){
		
		String pega = f.getCodigo();
		
		String sql ="select nome,codigo,cpf,rua,bairro,cidade, data, n,fone from funcionario where codigo = "+pega;

		
		try{
			 Statement st = (Statement) GerenteConxao.getConexao().createStatement();
	            ResultSet pst = st.executeQuery(sql);
	            while (pst.next()) {  
	               f.setNome(pst.getString("nome"));
	               f.setCodigo(pst.getString("codigo"));
	               f.setCpf(pst.getString("cpf"));
	               f.setRua(pst.getString("rua"));
	               f.setBairro(pst.getString("bairro"));
	               f.setCidade(pst.getString("cidade"));
	               f.setDataNascimento(pst.getString("data"));
	               f.setNumero(pst.getString("n"));
	               f.setFone(pst.getString("fone"));
	            }
	            
	        } catch (SQLException sqle) {
	            sqle.printStackTrace();
	        }
	
	
}	
}
