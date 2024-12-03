package bloque1Herencia.articuloscomestibles;

import java.util.Scanner;

public class tienda {
	public static void main(String[] args) {
		
		articulos[] listaarticulos = new articulos[100];
		articulospere[]listaarticulospere = new articulospere[100];
		
		Scanner sc = new Scanner(System.in);
			
		for (int n = 0; n <4; n++ ) {
			System.out.println("Introduzca el codigo: ");
			int codigo = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el precio: ");
			int precio = sc.nextInt();
			sc.nextLine(); //LIMPIAR BUFFER 
			System.out.println("Introduzca la fecha de caducidad: ");
			String fecha = sc.nextLine();
			if( fecha.equals("")) {
				listaarticulospere[n] = new articulospere(codigo,nombre,precio);
			}
			else {
				listaarticulos[n] = new articulos(codigo,nombre,precio,fecha);
			}
		}
			for ( int cont = 0; cont <= 4; cont++){
				if(listaarticulospere[cont] != null)
				System.out.println(listaarticulospere[cont]);	
				}
			for ( int cont = 0; cont <= 4; cont++){
				if(listaarticulos[cont] != null)
				System.out.println(listaarticulos[cont]);
				}
		}
}

