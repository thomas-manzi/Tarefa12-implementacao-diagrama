package Pedidos;

import java.util.Calendar;
import java.util.Date;

public class Operacao {
	private Calendar dInicio;
	private Calendar dFim;
	public Calendar getdInicio() {
		return dInicio;
	}
	public void setdInicio(Calendar dInicio) {
		this.dInicio = dInicio;
	}
	public Calendar getdFim() {
		return dFim;
	}
	public void setdFim(Calendar dFim) {
		this.dFim = dFim;
	}
	
	Calendar calendario= Calendar.getInstance();
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [dInicio=");
		builder.append(dInicio);
		builder.append(", dFim=");
		builder.append(dFim);
		builder.append("]");
		return builder.toString();
	}
	
	

	

}
