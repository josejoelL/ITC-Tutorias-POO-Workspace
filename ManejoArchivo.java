package asesorias;

import java.io.RandomAccessFile;
import java.util.ArrayList;

import GRUD.Rutinas;

public class ManejoArchivo {
	RandomAccessFile arch;
	
	public void abrirArchivo() {
		try {
			arch=new RandomAccessFile("ArchPersonas.dat","rw");
		}catch(Exception e) {}
	}
	
	public void cerrarArchivo() {
		try {
			arch.close();
		}catch(Exception e) {}
	}
	
	public boolean registrarPersona(Personav2 persona) {
		try {
			arch.seek(arch.length());
			arch.writeUTF(Rutinas.PonBlancos(persona.getNombre(),25));
			arch.writeUTF(Rutinas.PonBlancos(persona.getApellido(),25));
			arch.writeInt(persona.getEdad());
			arch.writeBoolean(true);
		}catch(Exception e) {return false;}
		return true;
	}
	
	public ArrayList<Personav2> consultarPersonas() {
		ArrayList<Personav2> ap=new ArrayList<Personav2>();
		try {
			int ndatos=(int) (arch.length()/Personav2.LARGO);
			for(int i=0 ; i<ndatos ; i++) {
				arch.seek(i*Personav2.LARGO+27+27+4);
				if(!arch.readBoolean())
					continue;
				arch.seek(i*Personav2.LARGO);
				ap.add(new Personav2(arch.readUTF().trim(),arch.readUTF().trim(),arch.readInt()));
			}
		}catch(Exception e) {}
		return ap;
	}
	
	public Personav2 consultarPersonaPorNombre(String nombre) {
		String nom,ape;
		int edad;
		try {
			int i=-1;
			do {
				i++;
				arch.seek(i*Personav2.LARGO);
				nom=arch.readUTF().trim();
				ape=arch.readUTF().trim();
				edad=arch.readInt();
			}while(!nombre.equalsIgnoreCase(nom));
		}catch(Exception e) {return null;}
		try {
			if(!arch.readBoolean())
				return null;
		}catch(Exception e) {}
		return new Personav2(nom,ape,edad);
	}
	
	public void darBajaPorNombre(String nombre) {
		String nom,ape;
		int edad;
		try {
			int i=-1;
			do {
				i++;
				arch.seek(i*Personav2.LARGO);
				nom=arch.readUTF().trim();
				ape=arch.readUTF().trim();
				edad=arch.readInt();
			}while(!nombre.equalsIgnoreCase(nom));
		}catch(Exception e) {return;}
		try {
			arch.writeBoolean(false);
		}catch(Exception e) {}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
