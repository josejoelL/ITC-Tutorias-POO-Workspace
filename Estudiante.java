package asesorias;

public class Estudiante extends Persona 
{
	private int numeroControl;

	public Estudiante(String nombre, float estatura, float peso, int edad, char sexo, int numeroControl)
	{
		super(nombre, estatura, peso, edad, sexo);
		this.numeroControl = numeroControl;
	}

	public void celebrar() 
	{
		System.out.println("Al fin se acabó el semestre!!!");
	}

	public String reir() 
	{
		return "HAHAHAHAHAHAHA";
	}
	public void irBurritos()
	{
		
	}
	
	
}
