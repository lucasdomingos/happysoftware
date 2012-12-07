package Controlador;

import javax.swing.JOptionPane;

import Modelo.Cliente;
import Repositorio.ClienteRepositorio;

public class ClienteControlador {
	
   /**
    * @param Declara��o de atributo ClienteControlador
    */
  private static ClienteRepositorio exec = new ClienteRepositorio();
	
	
	
	/**
	 * Este metodo salva o cliente no banco de dados,
	 * e faz o tratamento dos campos e suas valida��es  
	 * de suas informa��es caso algos esteja errado n�o 
	 * ira cadastrar o usu�rio no banco de dados
	 * @param c da classe Cliente que � nosso modelo ou objeto
	 *  
	 */
	public  void SalvaClienteControlador(Cliente c){
		
		if(!c.getNome().equalsIgnoreCase("") && (!c.getSobrenome().equalsIgnoreCase(""))){
			int a=0;
			
			try{
				
				a = Integer.parseInt(c.getCodigo()); 
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
			
			if(a>0){
			exec.salvarClienteRepositorio(c);
		
			}
			else{
				JOptionPane.showMessageDialog(null, "Insira numeros no codigo!");
			}
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Insira valores nos campos!");
		}
		
	} // FIM DO METODO salvaClienteControlador
	
	
	
	/**
	 * Este metodo chama e executa o metodo 
	 * ExcluirClienteRepositorio que esta na ClienteRepositorio
	 * @param c
	 */
	
	public void ExcluirClienteControlador(Cliente c){
		
		int codigo=0;
		
		try{
			
			codigo = Integer.parseInt(c.getCodigo());
			
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "Insira o n�mero do codigo correto!");
		}
		
		if(codigo > 0){
			
		exec.ExcluirClienteRepositorio(c);
		}
		else{
			JOptionPane.showMessageDialog(null, "Insira o numero do codigo\n " +
					                            "para ser excluido do bando");
		}
	}//FIM do metodo ExcluirClienteControlador
	
	
	
	public void BuscarClienteControlador(Cliente c){
		
		System.out.println("teste");
		System.out.println("kkk"+c.getCodigo());
		int a=0;
		try{
			a = Integer.parseInt(c.getCodigo());
		
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(null, "Insira o codigo correto!");
		}
		
		
		
		if(a > 0 && a<1000){
			
			exec.BuscarClienteRpositorio(c);
			
		}
		
		else if (c.getCodigo().equalsIgnoreCase("") ){
			JOptionPane.showMessageDialog(null, "Usuario n�o cadastrado!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Insira o codigo para a busca!");
		}
	}// FIM do metodo buscar 
	
	
}
