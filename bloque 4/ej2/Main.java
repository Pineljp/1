package cap5.ej2;

import tutorialJava.Utils;

public class Main {

	public static void main(String[] args) {
		
		animal[] animales = new animal[5];
			for (int i = 0; i < 5; i++) {
				int m = Utils.obtenerNumeroAzar (0, 1);
				switch (m) {
				case 0:
				animales[i] = new Perro();
				break;
				case 1:
				animales[i] = new Gato();
				 break;
				 default:
				 System.out.println("iyoooo...");
				 break;
			}
			}
			for (animal wasoski : animales) {
				wasoski.emitirSonido();
			}
		}

}
	

	

