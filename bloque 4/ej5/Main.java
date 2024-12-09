package cap5.ej5;
import tutorialJava.Utils;

public class Main {

	public static void main(String[] args) {
	int n = Utils.obtenerNumeroAzar(1, 10);
	Producto[] productos = new Producto[n];
	
	for (int m = 0; m<n; m++) {
		productos[m] = new Producto();
	}
	Producto.obtenerContador();
}
}
