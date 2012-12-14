package Controlador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PRAcroForm;
import com.itextpdf.text.pdf.PdfWriter;

import Modelo.Cliente;
import Repositorio.ClienteRepositorio;

public class ClienteControlador {
	
   /**
    * @param Declaração de atributo ClienteControlador
    */
  private static ClienteRepositorio exec = new ClienteRepositorio();
	
	
	
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
			JOptionPane.showMessageDialog(null, "Insira o número do codigo correto!");
		}
		
		if(codigo > 0){
			
		exec.ExcluirClienteRepositorio(c);
		}
		else{
			JOptionPane.showMessageDialog(null, "Insira o numero do codigo\n " +
					                            "para ser excluido do bando");
		}
	}//FIM do metodo ExcluirClienteControlador
	
	
	/**
	 * este metodo busca os dados 
	 * do modelo cliente que está no banco 
	 * de dados 
	 * @param c
	 */
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
			JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Insira o codigo para a busca!");
		}
	}// FIM do metodo buscar 
	
	
	
	/**
	 * Este metodo gera um PDF dos 
	 * dados que estão no banco de dado
	 * @param c
	 * @throws DocumentException 
	 */
	public void GerarpdfClienteControlador(Cliente c) throws IOException, DocumentException{
		
		String caminho="";
		JFileChooser salva = new JFileChooser();
		salva.showSaveDialog(null);
		caminho = salva.getSelectedFile().getAbsolutePath();
		System.out.println(caminho);
		Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
		Document documento =null;
	    OutputStream caminho1 =null;
	     String nome =c.getNome()+" "+c.getSobrenome();
		 String codigo = c.getCodigo();
		 String cpf =c.getCpf();
		 String rua = c.getRua();
		 String bairro = c.getBairro();
		 String cidade = c.getCidade();
		 String numero = c.getNumero();
		 String telefone = c.getTelefone();
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
			            Paragraph p1 = new Paragraph("Cliente Cadastrado", f);
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
	
}
