package cap5.ej7;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		int n = 0;
		int m;

		
		while (n != 3) {
			System.out.println("Elija la opcion que desee \n 1.Agregar usuario \n 2.Eliminar usuario \n 3.Salir");
			 n = sc.nextInt();
		switch (n) {
		case 1 :
			sc.nextLine();
			System.out.println("Cuantos usuarios desea añadir? ");
			 m = sc.nextInt();
			Usuario.agregarUsuarios(m);
			System.out.println("Actualmente hay " + Usuario.totalUsuarios + "usuarios");
			break;

			
		case 2 :
			sc.nextLine();
			System.out.println("Cuantos usuarios desea eliminar? ");
			 m = sc.nextInt();
			Usuario.eliminarUsuarios(m);
			System.out.println("Actualmente hay " + Usuario.totalUsuarios + "usuarios");
			break;

		case 3 :
			System.out.println("¡Hasta luego!");
			break;
		    }
		

			
		}
	
	}
}

