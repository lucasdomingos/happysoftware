package Controlador;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import Modelo.Funcionario;
import Repositorio.FuncionarioRepositorio;
import Util.GerenteConxao;

@SuppressWarnings("unused")
public class FuncionarioControlador {

	private static FuncionarioRepositorio exec = new FuncionarioRepositorio(); 
	
	/**Este metodo salva o funcionari no banco de dados,
	 * e faz o tratamento dos campos e suas validações  
	 * de suas informações caso algos esteja errado não 
	 * ira cadastrar o usuário no banco de dados
	 * @param f da classe Funcionario que é nosso modelo ou objeto 
	 */
	public void salvaFuncionarioControlador(Funcionario f){
	
		 
		System.out.println(f.getNome()+" "+f.getSobrenome());
		 System.out.println(f.getCodigo());
		 System.out.println(f.getCpf());
		 System.out.println(f.getRua());
		 System.out.println(f.getBairro());
		 System.out.println(f.getCidade());
		 System.out.println(f.getDataNascimento());
		 System.out.println(f.getNumero());
		 System.out.println(f.getFone());		
		 
		
			
			
	   
	    //  TRATAMENTO DE ESSECAO
	    if((!f.getNome().equalsIgnoreCase("")) && (!f.getSobrenome().equalsIgnoreCase(""))){	
	    	
	    	
			
	    	int a=0;
	    	
	    	try{
	    		
	    		 a = Integer.parseInt(f.getCodigo());
	    		
			
			  if (a>0){
	    		 exec.salvaFuncionarioRepositorio(f);
			  }
			  else{
				  JOptionPane.showMessageDialog(null, "ERRO!  Insira numeros positivos ok!");
			  }
	    	}catch(Exception e){
	    		e.printStackTrace();
	    		JOptionPane.showMessageDialog(null, "Insira numeros que não seja negativos nos campos de numeros!");
	    	}
	    	
				
			
	    	}
	    	
	    	else{
	    		JOptionPane.showMessageDialog(null, "Erro preencha os campos!");
	    	}
	    	
	    
	
	} // FIM do metodo salvaFuncionarioControlador
	
	
	/**
	 * Metodo serve para excluir um funcionario 
	 * no banco de dados 
	 * @param f
	 */
	public void ExcluirFuncionarioControlador(Funcionario f){
		
		
		int codigo =0; 
		
		try {
			
			codigo = Integer.parseInt(f.getCodigo());
			
		}catch (Exception e){
			
		}
		
       if (codigo >0){
			
			exec.ExcluiFuncionarioRepositorio(f);
		}
		else{
			JOptionPane.showMessageDialog(null, "Insira pelo menos o nome do\n produto para ser Excluido do bando!");
		}
		
		
	}//FIM do metodo ecluir 
	
	public void BuscarFuncionarioControlador(Funcionario f){
		int a=0;
		String valor="";
		
		try{
			a=Integer.parseInt(f.getCodigo());
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Insira o codigo para realizar a busca!");
			e.printStackTrace();
		}
		
		valor += a;
		
		if (a>0 && a<1000){
			exec.BuscarClienteRpositorio(f);
		}
		
		else if (valor.equalsIgnoreCase("") ){
			JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
		}
		
		
		
	}

	
	
	
}
