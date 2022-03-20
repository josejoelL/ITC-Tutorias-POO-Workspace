package asesorias;

import java.io.*;
import java.util.Scanner;

public class ArchivosBinarios {

	public static void main(String[] args){

		try {
			
			RandomAccessFile arch= new RandomAccessFile("archivo.DAT","rw");
			/*
			for(int i=0; i<10 ; i++) {
				arch.writeUTF(Rutinas.PonBlancos( Rutinas.VN[Rutinas.nextInt(0,Rutinas.VN.length-1)] ,15));
				arch.writeFloat(Rutinas.nextInt(1, 2));
				arch.writeFloat(Rutinas.nextInt(60,90));
				arch.writeInt(Rutinas.nextInt(18,22));
				arch.writeChar( Rutinas.nextInt(1,2)==1?'M':'H' );
			}
			*/
			arch.seek(0);
			for(int i=0 ; i<10 ; i++) {
				//arch.seek(i*Persona.LARGO);
				System.out.println(arch.readUTF());
				System.out.println(arch.readFloat());
				System.out.println(arch.readFloat());
				System.out.println(arch.readInt());
				System.out.println(arch.readChar());
				System.out.println();
			}
			
			System.out.println("Que elemento quieres ver?");
			int a=new Scanner(System.in).nextInt();
			arch.seek((a-1)*Persona.LARGO);
			System.out.println(arch.readUTF());
			System.out.println(arch.readFloat());
			System.out.println(arch.readFloat());
			System.out.println(arch.readInt());
			System.out.println(arch.readChar());
			
			
		}catch(Exception e){
			System.out.println("Excepción");
		}
	}

}
