package asesorias;

public class Personav2 {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean estado;
	static final int LARGO=27+27+4+1;
	
	public Personav2(String n,String a,int e) {
		nombre=n;
		apellido=a;
		edad=e;
		estado=true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
