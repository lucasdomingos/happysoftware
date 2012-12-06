package Controlador;

import Modelo.Despesa;
import Repositorio.DespesaRepositorio;

public class DespesaControlador {

	private  DespesaRepositorio rc;
	
    public DespesaControlador(){
  
    	rc = new DespesaRepositorio();
    }
	
	
	public void salvaDespesasControlador (Despesa d){
		
	rc.salvaDespesaRepositorio(d);	
		
		
	}
	
	public void ExcluirDespesasControlador(Despesa d){
		
		rc.ExcluirDespesaRepositorio(d);
	}


	
	
	
}
