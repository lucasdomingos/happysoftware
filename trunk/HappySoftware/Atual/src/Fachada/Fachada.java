package Fachada;

import java.io.IOException;
import java.sql.SQLException;

import com.itextpdf.text.DocumentException;

import Controlador.ClienteControlador;
import Controlador.DespesaControlador;
import Controlador.FuncionarioControlador;
import Controlador.ProdutoControlador;
import Controlador.VendasControlador;
import Modelo.Cliente;
import Modelo.Despesa;
import Modelo.Funcionario;
import Modelo.Produto;
import Modelo.Vendas;

public class Fachada {
	
	
	
	ProdutoControlador controladorProduto = new ProdutoControlador();
	FuncionarioControlador controladorfuncionario = new FuncionarioControlador();
	ClienteControlador controladorCliente = new ClienteControlador();
	DespesaControlador controladordespesa = new DespesaControlador();
	VendasControlador controladorVendas  = new VendasControlador();
	
	
	
	/**
	 * Estes metodos são os controladores 
     * da Classe Produto que servem para 
     * salvar, ecluir, listar e alterar 
     * os valores no banco de dados  
	 * @param p
	 * @throws SQLException
	 */
	public void salvarProdutos(Produto p)throws SQLException {
		controladorProduto.SalvarProdutoControlador(p);
	}
	public void excluirProduto(Produto p){
		controladorProduto.ExcluirProdutoControlador(p);
	}
	public void BuscarProduto(Produto p){
		controladorProduto.BuscarProdutoControlador(p);
	}
	
	
	
	public void salvafuncionario(Funcionario f){
		controladorfuncionario.salvaFuncionarioControlador(f);
	}
	public void Excluirfuncionario(Funcionario f){
		controladorfuncionario.ExcluirFuncionarioControlador(f);
	}
	public void BucarFuncionario(Funcionario f){
		controladorfuncionario.BuscarFuncionarioControlador(f);
	}
	public void GerarPDFFuncionario(Funcionario f) throws DocumentException, IOException{
		controladorfuncionario.GerarpdfFuncionarioControlador(f);
	}
	
	
	public void salvaCliente(Cliente c){	
		controladorCliente.SalvaClienteControlador(c);
	}
	
	public void ExcluirCliente(Cliente c){
		controladorCliente.ExcluirClienteControlador(c);
	}
	public void BuscarCliente(Cliente c){
		controladorCliente.BuscarClienteControlador(c);
	}
	public void GerarpdfCliente(Cliente c) throws IOException, DocumentException{
		controladorCliente.GerarpdfClienteControlador(c);
	}
	
	
    public void salvaDespesas(Despesa d){
	controladordespesa.salvaDespesasControlador(d);
	
    }
	public void ExcluirDespesas(Despesa d){
		controladordespesa.ExcluirDespesasControlador(d);
	}
 
    
	/**Estes metodos são os controladores 
      * da Classe cleinte que servem para 
      * salvar, ecluir, listar e alterar 
      * os valores no banco de dados 
      * @param v
      * @throws SQLException
      */
	public void SalvaVendas(Vendas v) throws SQLException {
		 controladorVendas.salvaVendasControlador(v);
		 
	}
   public void ExcluirVendas(Vendas v){
	   controladorVendas.ExcluirVendasControlador(v);
    }

   public void BuscarVendas(Vendas v){
	   controladorVendas.BuscarVendaControlador(v);
   }




  
	
	
	
	
}
