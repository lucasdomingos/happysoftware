package Controlador;

import javax.swing.JOptionPane;

import Modelo.Cliente;
import Repositorio.ClienteRepositorio;

public class ClienteControlador {
	

  private static ClienteRepositorio ClienteControlador = new ClienteRepositorio();
	
	
	
	/**
	 * Este metodo salva o cliente no banco de dados,
	 * e faz o tratamento dos campos e suas validações  
	 * de suas informações caso algos esteja errado não 
	 * ira cadastrar o usuário no banco de dados
	 * @param c da classe Cliente que é nosso modelo ou objeto
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
			ClienteControlador.salvarClienteRepositorio(c);
		
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
		
		ClienteControlador.ExcluirClienteRepositorio(c);
		
	}
	
	
}
