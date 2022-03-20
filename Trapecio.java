package asesorias;

public class Trapecio extends Cuadrilatero{

	private double altura;
	
	public Trapecio(double l1,double l2,double l3) {
		super(l1, l2, l3, l3);
		altura=Math.sqrt( Math.pow(L3,2) - Math.pow( ((L2-L1)/2) ,2));
	}

	@Override
	public double area() {
		return ((L1+L2)*altura)/2;
	}

}
