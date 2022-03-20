package asesorias;

public class Circulo extends Ovalo{
	public Circulo(double r) {
		super(r,r);
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(Radio1, 2);
	}

	@Override
	public double perimetro() {
		return Math.PI * (Radio1*2);
	}
}
