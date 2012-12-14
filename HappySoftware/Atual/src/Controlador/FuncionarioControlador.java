package Controlador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.CodingErrorAction;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfWriter;
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
		
		
		
	} //FIM do metodo

	public void GerarpdfFuncionarioControlador(Funcionario f) throws DocumentException, IOException{
		 String codigo   = f.getCodigo();
		 String cpf      = f.getCpf();
		 String rua      = f.getRua();
		 String bairro   = f.getBairro();
		 String cidade   = f.getCidade();
		 String numero   = f.getNumero();
		 String data     = f.getDataNascimento();
		 String telefone = f.getFone();
		
		if(((!f.getNome().equalsIgnoreCase("")) && (!f.getCodigo().equalsIgnoreCase(""))  && (!f.getRua().equalsIgnoreCase(""))) /*fim */ && /*começo*/ ((!f.getCpf().equals("")) && (!f.getBairro().equalsIgnoreCase("")) && (!f.getCidade().equalsIgnoreCase(""))  && (!f.getFone().equalsIgnoreCase(""))) ){
		String caminho="";
		JFileChooser salva = new JFileChooser();
		salva.showSaveDialog(null);
		caminho = salva.getSelectedFile().getAbsolutePath();
		System.out.println(caminho);
		Font f2 = new Font(FontFamily.COURIER, 20, Font.BOLD);
		Document documento =null;
	    OutputStream caminho1 =null;
	     String nome     = f.getNome()+" "+f.getSobrenome();
		
	     System.out.println(nome+"\n"+codigo+"\n"+cpf+"\n"+rua+"\n"+cidade+"\n"+bairro+"\n"+numero+"\n"+telefone);
	     
		 try {
		
			             //cria o documento tamanho A4, margens de 2,54cm
			             documento = new Document(PageSize.A4, 72, 72, 72, 72);
			
			             //cria a stream de saída
			             caminho1 = new FileOutputStream(caminho+".pdf");
			 
			        
			 
			             //associa a stream de saída ao
			             PdfWriter.getInstance(documento, caminho1);
			 
			        
			             //abre o documento
			             documento.open();
			 
			             
			             Paragraph p = new Paragraph("+-----------------------------------Happy-Software--------------------------------+"); 
			             documento.add(p);
			             
			             //adiciona o texto ao PDF
			            Paragraph p1 = new Paragraph("Funcionário Cadastrado", f2);
			            p1.setAlignment(Element.ALIGN_CENTER);
			            p1.setSpacingAfter(20);
			            documento.add(p1);
			            Paragraph line = new Paragraph("+----------------------------------------------------------------------------------------+");
			            documento.add(line);
			            Paragraph p2 = new Paragraph();  
			            p2.add("NOME: "+nome+"\n"+
			            "CODIGO: "+codigo+"\n"+
			            "CPF: "+cpf+"\n"+
			            "RUA: "+rua+"\n"+
			            "BAIRRO: "+bairro+"\n"+
			            "CIDADE: "+cidade+"\n"+
			            "Nº: "+numero+"\n"+
			            "DATA: "+data+"\n"+
			            "FONE: "+telefone+
			            "\n"+"+----------------------------------------------------------------------------------------+");
			            documento.add(p2);
			            
			            
			          
			           
			         } finally {
			 
			             if (documento != null) {
			 
			                 //fechamento do documento
			 
			                 documento.close();
			 
			             }
			 
			             if (caminho1 != null) {
			 
			                //fechamento da stream de saída
			 
			                caminho1.close();
			 
			             }
			 
			         }

		
		}
		else{
			JOptionPane.showMessageDialog(null, "Erro preencha os campos!");
		}
	}
	
	
}
