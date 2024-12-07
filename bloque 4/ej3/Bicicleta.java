package cap5.ej3;

public class Bicicleta extends Vehiculo {

	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}

	public Bicicleta(String model, int velocidadActual) {
		super(model, velocidadActual);
		// TODO Auto-generated constructor stub
	}

	@Override
	String acelerar() {
		velocidadActual = velocidadActual + 2;
		return "al acelerar la bicicleta va a" + velocidadActual + " ";
	}


	@Override
	String frenar() {
		velocidadActual= velocidadActual -2;
		return "al frenar la bicicleta va a " + velocidadActual + " ";
	}

}
