package Controlador;

import java.awt.geom.RoundRectangle2D.Double;
import java.beans.Expression;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import Modelo.*;
import Repositorio.ProdutoReopositorio;
import Telas.TelaProdutos;


public class ProdutoControlador {
	
	
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
		  
		  
		  
		  
		  ProdutoReopositorio.SalvarProduto(p);
	  }catch (Exception e){
		  
		  e.printStackTrace();
		  
	
		 JOptionPane.showMessageDialog(null, "Erro Insira NÚMERO nos campos de números");
		  
	  }
	  
	
		  
		
	  
	
	  }// if  

	  else {
		  
		  JOptionPane.showMessageDialog(null, "Insira valores nos campos de Nome e Codigo!");
	  }
	
	  
  }//fim fo metodo corrigir
  
  
}//fim da classe
