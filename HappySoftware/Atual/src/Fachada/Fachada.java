package Fachada;

import java.sql.SQLException;

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
	
	
	
	
	public void salvarProdutos(Produto p)throws SQLException {
		
		
		controladorProduto.SalvarProdutoControlador(p);
	}
	
	
	public void salvafuncionario(Funcionario f){
		
		
		controladorfuncionario.salvaFuncionarioControlador(f);
	}
	
	
	public void salvaCliente(Cliente c){
		
		controladorCliente.SalvaClienteControlador(c);
		
	}
	
	public void ExcluirCliente(Cliente c){
		
		controladorCliente.ExcluirClienteControlador(c);
		
	}
	
	
	
	
    public void salvaDespesas(Despesa d){
	
	controladordespesa.salvaDespesasControlador(d);
	
    }
	
 

	public void SalvaVendas(Vendas v) throws SQLException {
		
	
		 controladorVendas.salvaVendasControlador(v);
		 
	}
  
  
	
	
	
	
}
