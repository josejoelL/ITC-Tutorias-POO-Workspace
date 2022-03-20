package asesorias;

public class Mesas {
	private int Id;
	private int Capacidad;
	private boolean Disponibilidad;
	
	public Mesas(int i,int c) {
		Id=i;
		Capacidad=c;
		Disponibilidad=true;
	}

	public int getId() {
		return Id;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}

	public boolean isDisponibilidad() {
		return Disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		Disponibilidad = disponibilidad;
	}
	
	public String toString() {
		return Id+"\t"+Capacidad;
	}
}
