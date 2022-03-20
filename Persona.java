package asesorias;

import GRUD.Rutinas;

public abstract class Persona
{
	private String nombre;
	private float estatura;
	private float peso;
	private int edad;
	private char genero;
	public static final long LARGO=17+4+4+4+2;
	public Persona(String nombre, float estatura, float peso, int edad, char sexo)
	{
		this.nombre=Rutinas.PonBlancos(nombre, 15);
		this.estatura=estatura;
		this.peso=peso;
		this.edad=edad;
		genero=sexo;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public float getEstatura()
	{
		return estatura;
	}
	public void setEstatura(float estatura) 
	{
		this.estatura = estatura;
	}
	public float getPeso() 
	{
		return peso;
	}
	public void setPeso(float peso)
	{
		this.peso = peso;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	public char getGenero()
	{
		return genero;
	}
	public void setGenero(char genero) 
	{
		this.genero = genero;
	}
	public abstract void celebrar();
	public abstract  String reir();
	
	
}
