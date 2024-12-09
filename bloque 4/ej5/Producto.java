package cap5.ej5;

public class Producto {

	static int cont = 0;
	Producto(){
	 cont++;
	}
	static void obtenerContador() {
		System.out.println("Se han creado "+ cont +" productos.");
	}
}
