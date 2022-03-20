package asesorias;

public class Cuadrado {
	private int L;
	
	public Cuadrado(){
		L=10;
	}
	public Cuadrado(int l){
		L=l;
	}
	
	public float Area(){
		return L*L;
	}
	
	public int Perimetro(){
		return 4*L;
	}

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}
}
