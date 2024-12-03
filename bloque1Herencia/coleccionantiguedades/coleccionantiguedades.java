package bloque1Herencia.coleccionantiguedades;

import java.util.Scanner;

public class coleccionantiguedades {
	public static void main(String[] args) {
		int Laen = 0;
		int Labn = 0;
		int Larn = 0;
		int Lajn = 0;
		int Laln = 0;

		antiguedadbase[] Lab = new antiguedadbase[100];
		antiguedadestatuilla[] Lae = new antiguedadestatuilla[100];
		antiguedadretrato[] Lar = new antiguedadretrato[100];
		antiguedadjoya[] Laj = new antiguedadjoya[100];
		antiguedadlibro[] Lal = new antiguedadlibro[100];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Elija el tipo de antiguedad que quiere registrar: \n 1.Estatuilla \n 2.Retrato \n 3.Joya \n 4.Libro \n 5.Otra \n 0.Cerrar \n");
		int op = sc.nextInt();
		while(op != 0) {
		if (op == 1) {

			System.out.println("Introduzca el codigo: ");
			int codigo = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el precio: ");
			int precio = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el autor: ");
			String autor = sc.nextLine();
			System.out.println("Introduzca el tamaño: ");
			int tamaño = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			
			Lae[Laen] = new antiguedadestatuilla(codigo, nombre, precio, autor, tamaño);
			System.out.println(Lae[Laen]);
			Laen++;
		}
		if (op == 2) {
			System.out.println("Introduzca el codigo: ");
			int codigo = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el precio: ");
			int precio = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el autor: ");
			String autor = sc.nextLine();
			
			Lar[Larn] = new antiguedadretrato(codigo, nombre, precio, autor);
			System.out.println(Lar[Larn]);
			Larn++;
		}
		if (op == 3) {
			System.out.println("Introduzca el codigo: ");
			int codigo = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el precio: ");
			int precio = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el material: ");
			String material = sc.nextLine();
			
			Laj[Lajn] = new antiguedadjoya(codigo, nombre, precio, material);
			System.out.println(Laj[Lajn]);
			Lajn++;
		}
		if (op == 4) {
			System.out.println("Introduzca el codigo: ");
			int codigo = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el precio: ");
			int precio = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el autor: ");
			String autor = sc.nextLine();
			
			Lal[Laln] = new antiguedadlibro(codigo, nombre, precio, autor);
			System.out.println(Lal[Laln]);
			Laln++;	
		}
		if (op == 5) {
			System.out.println("Introduzca el codigo: ");
			int codigo = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el precio: ");
			int precio = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			
			Lab[Labn] = new antiguedadbase(codigo, nombre, precio);
			System.out.println(Lab[Labn]);
			Labn++;
		}
	}
	}

}
