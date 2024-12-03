package ejercicios.bloque1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Persona[] personas = new Persona[100];
		
		int NP=0;
		
		int NO=-1;
		
		while (NO != 0) {
		System.out.println("Elija entre las siguientes opciones \n 0-Salir \n 1-Introducir datos de persona \n 2-Ver las personas introducidas, con todos sus datosn");
		
		
		Scanner sc = new Scanner(System.in);
		NO = sc.nextInt();
		 sc.nextLine(); //LIMPIAR BUFFER 
		
		if (NO == 1) {  
			System.out.println("Introduzca el nombre de la persona: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca Los apellidos de la persona: ");
			String apellidos = sc.nextLine();
			System.out.println("Introduzca el dni de la persona: ");
			String dni = sc.nextLine();
			System.out.println("Introduzca la dirección de la persona: ");
			String direccion = sc.nextLine();
			System.out.println("Introduzca el teléfono de la persona: ");
			int telefono = sc.nextInt();
			
			sc.nextLine();//LIMPIAR BUFFER
			NP++;
			
			personas[NP] = new Persona(nombre, apellidos, dni, direccion, telefono);
			
		}
		
		if (NO == 2) {
			for ( int cont = 1; cont <= NP; cont++){
				System.out.println(personas[cont]);
				
			}
			
		}
		
	}

	}
}

