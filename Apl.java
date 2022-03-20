package asesorias;

import java.util.Scanner;
import java.util.Vector;

public class Apl {
	
	static Scanner S=new Scanner(System.in);
	static Vector<Clientes> VClientes=new Vector<Clientes>();
	static Vector<Reservaciones> VReservaciones=new Vector<Reservaciones>();
	static Vector<Mesas> VMesas=new Vector<Mesas>();

	public static void main(String[] args) {
		do {
			switch( MostrarMenu() ) {
			case 1:
				System.out.print("Ingrese nombre: ");
				String nombre=S.next();
				System.out.print("Ingrese edad: ");
				int edad=S.nextInt();
				System.out.print("Ingrese telefono: ");
				long tel=S.nextLong();
				Clientes c=new Clientes(nombre,edad,tel);
				VClientes.add(c);
				break;
			case 2:
				System.out.print("Ingrese Id: ");
				int nm=S.nextInt();
				System.out.print("Ingrese capacidad: ");
				int cap=S.nextInt();
				Mesas m=new Mesas(nm,cap);
				VMesas.add(m);
				break;
			case 3: 
				RegistrarReservacion();
				break;
			case 4: 
				CancelarReservacion();
				break;
			case 5:
				MostrarMesas();
				break;
			case 6:
				MostrarClientes();
				break;
			case 7:
				MostrarReservaciones();
				break;
			case 8: 
				return;
			}
			System.out.println();
		}while(true);
	}
	
	private static void CancelarReservacion() {
		System.out.print("Id mesa a cancelar: ");
		int idmesa=S.nextInt();
		Mesas mesa=ObtenerMesa(idmesa);
		Reservaciones r=ObtenerReservacion(mesa);
		VReservaciones.remove(r);
	}
	
	private static void RegistrarReservacion() {
		System.out.print("Ingrese el numero de personas: ");
		int np=S.nextInt();
		if(!MostrarMesasDisponibles(np)) {
			System.out.println("No hay mesas disponibles");
			return;
		}
		System.out.print("Escoge una mesa: ");
		int idmesa=S.nextInt();
		Mesas mesa=ObtenerMesa(idmesa);
		System.out.print("Ingrese la hora: ");
		int hora=S.nextInt();
		if(!MostrarClientes()) {
			System.out.println("No hay clientes registrados");
			return;
		}
		System.out.print("Ingrese el número del cliente que reserva: ");
		int pos;
		do {
		pos=S.nextInt();
		if(pos<1 && pos>VClientes.size()) {
			System.out.println("Ingrese un número válido");
		}else
			break;
		}while(true);
		Clientes cliente=VClientes.get(pos-1);
		mesa.setDisponibilidad(false);
		VReservaciones.add(new Reservaciones(hora,cliente,mesa,np));
	}

	private static boolean MostrarMesasDisponibles(int np) {
		boolean band=false;
		for(int i=0 ; i<VMesas.size() ; i++) {
			if(np<=VMesas.get(i).getCapacidad() && VMesas.get(i).isDisponibilidad()) {
				band=true;
				System.out.println(VMesas.get(i));
			}
		}
		return band;
	}
	
	private static boolean MostrarClientes() {
		System.out.println();
		boolean band=false;
		for(int i=0 ; i<VClientes.size() ; i++) {
			System.out.println((i+1)+"-. "+VClientes.get(i));
			band=true;
		}
		System.out.println();
		return band;
	}
	
	private static void MostrarMesas() {
		System.out.println();
		for(int i=0 ; i<VMesas.size() ; i++) 
			System.out.println(VMesas.get(i));
		System.out.println();
	}
	
	private static void MostrarReservaciones() {
		System.out.println();
		for(int i=0 ; i<VReservaciones.size() ; i++) 
			System.out.println(VReservaciones.get(i));
		System.out.println();
	}

	private static Mesas ObtenerMesa(int id) {
		for(int i=0; i<VMesas.size(); i++) {
			if(id==VMesas.get(i).getId())
				return VMesas.get(i);
		}
		return null;
	}
	
	private static Reservaciones ObtenerReservacion(Mesas mesa) {
		for(int i=0 ; i<VReservaciones.size() ; i++) {
			if(VReservaciones.get(i).getMesa()==mesa) {
				return VReservaciones.get(i);
			}
		}
		return null;
	}
	public static int MostrarMenu() {
		System.out.println("1-. Dar de alta cliente");
		System.out.println("2-. Dar de alta mesa");
		System.out.println("3-. Registrar Reservación");
		System.out.println("4-. Cancelar Reservacion");
		System.out.println("Consultas");
		System.out.println("5-. Mesas");
		System.out.println("6-. Clientes");
		System.out.println("7-. Reservaciones");
		System.out.print("Opción: ");
		return S.nextInt();
	}
}
