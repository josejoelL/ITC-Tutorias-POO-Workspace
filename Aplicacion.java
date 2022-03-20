package asesorias;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
	
	static Scanner S=new Scanner(System.in);
	
	public static void main(String []a) {
		ManejoArchivo ma=new ManejoArchivo();
		boolean band=true;
		while(band) {
			switch(MostrarMenu()) {
			case 1:
				System.out.print("Ingrese el nombre de la persona: ");
				String nombre=S.next();
				System.out.print("Ingrese el apellido de la persona: ");
				String apellido=S.next();
				System.out.print("Ingrese la edad de la persona: ");
				int edad=S.nextInt();
				ma.abrirArchivo();
				if(ma.registrarPersona(new Personav2(nombre,apellido,edad))) {
					System.out.println("Insercion realizada");
					ma.cerrarArchivo();
					break;
				}
				System.out.println("Fallo en la insercion");
				ma.cerrarArchivo();
				break;
			case 2:
				ma.abrirArchivo();
				ArrayList<Personav2> ap=ma.consultarPersonas();
				if(ap==null || ap.size()==0) {
					System.out.println("No existen personas");
					ma.cerrarArchivo();
					break;
				}
				System.out.println("|Nombre\t\t|Apellido\t\t|Edad\t\t|");
				for(int i=0 ; i<ap.size() ; i++)
					System.out.println("|"+ap.get(i).getNombre()+"\t\t|"+ap.get(i).getApellido()+"\t\t|"+ap.get(i).getEdad()+"\t\t|");
				ma.cerrarArchivo();
				break;
			case 3:
				System.out.println("Ingrese el nombre de la persona");
				String nom=S.next();
				ma.abrirArchivo();
				Personav2 p=ma.consultarPersonaPorNombre(nom);
				ma.cerrarArchivo();
				if(p==null) {
					System.out.println("No se encontró la persona");
					break;
				}
				System.out.println("Datos de la persona:");
				System.out.println("Nombre: "+p.getNombre());
				System.out.println("Apellido: "+p.getApellido());
				System.out.println("Edad: "+p.getEdad());
				break;
			case 4:
				System.out.println("Ingrese el nombre de la persona");
				String nom2=S.next();
				ma.abrirArchivo();
				ma.darBajaPorNombre(nom2);
				ma.cerrarArchivo();
				break;
			}
		}
	}
	
	public static int MostrarMenu() {
		System.out.println("----Menu----");
		System.out.println("1-. Registrar Persona");
		System.out.println("2-. Consultar personas");
		System.out.println("3-. Buscar persona");
		System.out.println("4-. Dar de baja una persona");
		return S.nextInt();
	}
}
