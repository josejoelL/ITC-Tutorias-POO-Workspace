package asesorias;

public class Rectangulo extends Cuadrilatero{
	public Rectangulo(double l1,double l2) {
		super(l1,l2,l1,l2);
	}

	public double area() {
		return L1*L2;
	}
	/*
	public double perimetro() {
		System.out.println("rectangulo");
		return (L1*2)+(L2*2);
	}
	*/
}
