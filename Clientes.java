package asesorias;

public class Clientes {
	private String Nombre;
	private int Edad;
	private long Telefono;
	
	public Clientes(String n,int e,long t) {
		Nombre=n;
		Edad=e;
		setTelefono(t);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public long getTelefono() {
		return Telefono;
	}

	public void setTelefono(long telefono) {
		String aux=telefono+"";
		if(aux.length()==10)
			Telefono = telefono;
	}
	
	public String toString() {
		return Nombre+"\t"+Edad+"\t"+Telefono;
	}
}
