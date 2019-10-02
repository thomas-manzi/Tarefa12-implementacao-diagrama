package Pedidos;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private int quantidade;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double totalItem() {
		double resultado=0;
		resultado=valor*quantidade;
		return resultado;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", soma()=");
		builder.append(totalItem());
		builder.append("]");
		return builder.toString();
	}
	
	
}
