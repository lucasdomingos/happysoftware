package Controlador;

import javax.swing.JOptionPane;

import Modelo.Funcionario;
import Repositorio.FuncionarioRepositorio;

public class FuncionarioControlador {

	 
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
	    		 FuncionarioRepositorio.salvaFuncionario(f);
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
	
}
