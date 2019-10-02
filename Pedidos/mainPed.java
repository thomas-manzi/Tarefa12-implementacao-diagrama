package Pedidos;
import java.util.Calendar;
public class mainPed {

	public static void main(String[] args) {
		Operacao op=new Operacao();
		Cliente c=new Cliente();
		Vendedor v=new Vendedor();
		Produto p=new Produto();
		Produto pp=new Produto();
		Pedido pdd=new Pedido();
		Calendar calendario= Calendar.getInstance();
		
		op.setdFim(Calendar.getInstance() );
		op.setdInicio(calendario);
		v.setCodigo(1);
		v.setNome("virtor");
		c.setCodigo(2);
		c.setEmail("tso@gna");
		c.setNome("mates");
		pp.setCodigo(3);
		pp.setDescricao("moto");
		pp.setQuantidade(3);
		pp.setValor(34);
		p.setCodigo(1);
		p.setDescricao("animal");
		p.setQuantidade(2);
		p.setValor(34.2);
		pdd.setCliente(c);
		pdd.setCodigo(1);
		pdd.setdFim(calendario);
		pdd.setdInicio(calendario);
		pdd.addP(p);
		pdd.addP(pp);
		pdd.setVendedor(v);
		
		System.out.println(p.totalItem());
		
		System.out.println(pdd);
		
		
	}

}
