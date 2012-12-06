package Controlador;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Modelo.Vendas;
import Repositorio.VendasRepositorio;
import Telas.TelaVenda;

@SuppressWarnings("unused")
public class VendasControlador {

public static VendasRepositorio exe = new VendasRepositorio();
		
	

	@SuppressWarnings("static-access")
	public void salvaVendasControlador(Vendas v) throws SQLException{
		
		
		String quantidade = v.getQuantidade();
		
		
		if((!v.getCliente().equalsIgnoreCase("")) && (!v.getProduto().equalsIgnoreCase("")) &&(!v.getVendedor().equalsIgnoreCase("")) ){
			
			try{
				
				
				int quanti = Integer.parseInt(quantidade);
				
				exe.salvaReposittorio(v);
				
			}catch(Exception e){
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Insira um numero na quantidade ok");
			}
			
			
			
			
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Preenchas os campos de Cliente, Vendedor e Produto");
		}
		
		
		
		
		
	}


	public void salvaVendasControlador() {
	
		
	}


	
	



}
