package cap5.ej3;

public class Coche extends Vehiculo {

	public Coche() {

	}

	public Coche(String model, int velocidadActual) {
		super(model, velocidadActual);

		

	}



	@Override
	String acelerar() {
		velocidadActual = velocidadActual + 5;
		return "al acelerar el coche va a" + velocidadActual + " ";
	}

	@Override
	String frenar() {
		velocidadActual= velocidadActual -5;
		return "al frenar el coche va a " + velocidadActual + " ";
	}

}
