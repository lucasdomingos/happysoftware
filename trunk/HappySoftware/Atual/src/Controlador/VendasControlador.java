package Controlador;

import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Modelo.Cliente;
import Modelo.Vendas;
import Repositorio.VendasRepositorio;
import Telas.TelaVenda;

@SuppressWarnings("unused")
public class VendasControlador {

public static VendasRepositorio exe = new VendasRepositorio();
		
	

	
	@SuppressWarnings("static-access")
	/**
	 * este metodo chama o metodo salvar 
	 * do Repositorio e salva os dados do cliente 
	 * no banco de dados 
	 * @param v
	 * @throws SQLException
	 */
	public void salvaVendasControlador(Vendas v) throws SQLException{
		
		
		String quantidade = v.getQuantidade();
		
		
		if((!v.getCliente().equalsIgnoreCase("")) && (!v.getProduto().equalsIgnoreCase("")) &&(!v.getVendedor().equalsIgnoreCase("")) ){
			
			try{
				
				
				int quanti = Integer.parseInt(quantidade);
				
				exe.salvaVendaRepositorio(v);
				
			}catch(Exception e){
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Insira um numero na quantidade ok");
			}
			
			
			
			
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Preenchas os campos de Cliente, Vendedor e Produto");
		}
		
		
		
		
		
	}//FIM do metodo salvaVendasControlador

    /**
     * Metodo do controlador faz o tratamento dos campos 
     * e logo em seguida chama o metodo excluir do 
     * repositorio 
     * @param v parametro de atributo da classe modelo Vendas 
     */
	public void ExcluirVendasControlador(Vendas v){
		
		
		if ((!v.getProduto().equalsIgnoreCase(""))){
			
			exe.ExcluirVendaRepositorio(v);
		}
		else{
			JOptionPane.showMessageDialog(null, "Insira pelo menos o nome do\n produto para ser Excluido do bando!");
		}
		
		
	}
    
	/**
	 * Este metodo faz uma busoca pelo 
	 * codigo do cliente no Repositorio 
	 * caso ele esteja cadastrado
	 * @param v
	 */
	public void BuscarVendaControlador(Vendas v){
		
		exe.BuscarVendasRepositorio(v);
		
	}
	
   public void GerarpdfVendasControlador(Cliente c){
	   
	   
   }


}
