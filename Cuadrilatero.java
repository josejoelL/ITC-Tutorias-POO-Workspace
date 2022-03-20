package asesorias;

public abstract class Cuadrilatero extends Figura{
	protected double L1,L2,L3,L4;

	public Cuadrilatero(double l1, double l2, double l3, double l4) {
		L1 = l1;
		L2 = l2;
		L3 = l3;
		L4 = l4;
	}

	public double getL1() {
		return L1;
	}

	public void setL1(double l1) {
		L1 = l1;
	}

	public double getL2() {
		return L2;
	}

	public void setL2(double l2) {
		L2 = l2;
	}

	public double getL3() {
		return L3;
	}

	public void setL3(double l3) {
		L3 = l3;
	}

	public double getL4() {
		return L4;
	}

	public void setL4(double l4) {
		L4 = l4;
	}
	
	@Override
	public double perimetro() {
		return L1+L2+L3+L4;
	}
	
	
}
