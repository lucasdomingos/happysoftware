package Controlador;

import java.awt.geom.RoundRectangle2D.Double;
import java.beans.Expression;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import Modelo.*;
import Repositorio.ProdutoReopositorio;
import Telas.TelaProdutos;
import Util.GerenteConxao;


@SuppressWarnings("unused")
public class ProdutoControlador {
	
	private static ProdutoReopositorio exec = new ProdutoReopositorio();
	

public void SalvarProdutoControlador(Produto p) throws SQLException{
	  
	  System.out.println(p.getNome());
	  System.out.println(p.getCod());
	  System.out.println(p.getMarca());
	  System.out.println(p.getCompra());
	  System.out.println(p.getVenda());
	  System.out.println(p.getEstoque());
	  
	  if(!p.getNome().equalsIgnoreCase("")){
		  
		  
	  try{
		  
		  int cod     = Integer.parseInt(p.getCod());
		  int compra  = Integer.parseInt(p.getCompra());
		  int venda   = Integer.parseInt(p.getVenda());
		  int estoque = Integer.parseInt(p.getEstoque());
		  
		  
		  
		  
		  exec.SalvarProdutoRepositorio(p);
		  
	  }catch (Exception e){
		  
		  e.printStackTrace();
		  
	
		 JOptionPane.showMessageDialog(null, "Erro Insira NÚMERO nos campos de números");
		  
	  }
	  
	
	  }// if  

	  else {
		  
		  JOptionPane.showMessageDialog(null, "Insira valores nos campos de Nome e Codigo!");
	  }
	  
      }//FIM do metodo 
  
  
    
	
	public void  ExcluirProdutoControlador(Produto p){
    	
		int codigo=0;
		
		try{
			
			codigo = Integer.parseInt(p.getCod());
			System.out.println(codigo);
		}catch (Exception e){
			
			e.printStackTrace();
		}
		
		
    	if(codigo > 0){
    		
    		exec.ExcluirProdutoRepositorio(p);
    		
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Insira um valor positivo!");
    	}
		
    }//FIM do metodo 
  
}//fim da classe
