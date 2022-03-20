package asesorias;

public class Industrial extends Estudiante 
{
	private int pedas;

	public Industrial(String nombre, float estatura, float peso, int edad, char sexo, int numeroControl, int pedas) {
		super(nombre, estatura, peso, edad, sexo, numeroControl);
		this.pedas = pedas;
	}
	public void celebrar()
	{
		super.celebrar();
		System.out.println("Vámonos a la "+(++pedas)+" peda");
	}
}
