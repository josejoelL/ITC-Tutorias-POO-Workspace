package asesorias;

public class App {
	public static void main(String[] a){
		Cuadrado C1=new Cuadrado(2);
		System.out.println(C1.Area());	
		Prueba(C1);
		System.out.println(C1.Area());
	}
	
	private static void Prueba(Cuadrado a){
		a.setL(7);
		System.out.println(a.Area());
	}
}
