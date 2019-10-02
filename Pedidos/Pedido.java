package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Operacao{
	private int codigo;
	protected Vendedor vendedor;
	protected Cliente cliente;
	private ArrayList<Produto> prodes;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Produto> getProd() {
		return prodes;
	}
	public void setProd(ArrayList<Produto> prod) {
		this.prodes = prod;
	}
	
	
	public Pedido() {
		vendedor =new Vendedor();
		cliente =new Cliente();
		prodes =new ArrayList<Produto>();
		
	}
	// criar um metodo para adicionar os produtos
	
	public boolean verificaProdutoUnico(Produto produto) {
		for (int i = 0; i < prodes.size(); i++) {
			if (produto.getDescricao().equalsIgnoreCase(prodes.get(i).getDescricao())) {
				
				return true;
			}
		}
		return false;
	}
	//3
	public boolean addProduto(Produto produto) {
		if (verificaProdutoUnico(produto)) {
			return true;
		}
		return false;
		
	}
	//4
	public double totalPedido(double total) {
		for (int i = 0; i < prodes.size(); i++) {
			total=prodes.get(i).totalItem();
			
		}
		return total;
	}
	//5
	public double valorMedio(double media) {
		double total=0;
		for (int i = 0; i < prodes.size(); i++) {
			total=prodes.get(i).getValor()+total;
		}
		media=total/(prodes.size());
		return media;
	}
	//6
	public List<Produto>quantidadeMaior(int quantidade){
		List<Produto>prodeQ= new ArrayList<Produto>();
		for (Produto p : prodes) {
			if (p.getQuantidade()>quantidade) {
				prodeQ.add(p);
			}
			
		}
		return prodeQ;
		
	}
	//7
	public String nomeVendedor(Vendedor vendedor) {
		return vendedor.getNome();
	}
	//8
	public String emailCliente(Cliente cliente) {
		return cliente.getEmail();
	}
	//9
	public List<Produto> buscaProdutoDescricao(String descricao) {
		List<Produto> prodeD =new ArrayList<Produto>();
		for (Produto p : prodes) {
			if (p.getDescricao().substring(0,descricao.length()).equals(descricao)) {
				prodeD.add(p);
				
			}	
		}
		return prodeD ;
	}
	//10
	public int dias() {
		long dt = (getdFim().getTimeInMillis() - getdInicio().getTimeInMillis())+ 3600000;
		long dias= (dt/86400000L);
		return (int) dias;
		
	}
	
	
	
	public void addP(Produto prod) {
		
		prodes.add(prod);
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [ codigo = ");
		builder.append(codigo);
		
		builder.append(vendedor);
		
		builder.append(cliente);
		builder.append(", prodes= ");
		builder.append(prodes );
		builder.append(" ] ");
		return builder.toString();
	}
	
	
	
}
