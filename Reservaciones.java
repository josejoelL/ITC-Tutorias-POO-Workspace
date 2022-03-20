package asesorias;

public class Reservaciones {
	private int Hora;
	private Clientes Cliente;
	private Mesas Mesa;
	private int Npersonas;
	
	public Reservaciones(int h,Clientes c,Mesas m,int np) {
		Hora=h;
		Cliente=c;
		Mesa=m;
		Npersonas=np;
	}

	public int getHora() {
		return Hora;
	}

	public void setHora(int hora) {
		Hora = hora;
	}

	public Clientes getCliente() {
		return Cliente;
	}

	public void setCliente(Clientes cliente) {
		Cliente = cliente;
	}

	public Mesas getMesa() {
		return Mesa;
	}

	public void setMesa(Mesas mesa) {
		Mesa = mesa;
	}

	public int getNpersonas() {
		return Npersonas;
	}

	public void setNpersonas(int npersonas) {
		Npersonas = npersonas;
	}
	
	public String toString() {
		return Cliente.getNombre()+"\t"+Hora+"\t"+Npersonas+"\t"+Mesa.getId();
	}
}
