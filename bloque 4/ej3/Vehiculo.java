package cap5.ej3;

public abstract class Vehiculo {


		String model;
		int velocidadActual;
		
		public Vehiculo() {
			super();
		}

		public Vehiculo(String model, int velocidadActual) {
			super();
			this.model = model;
			this.velocidadActual = velocidadActual;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getVelocidadActual() {
			return velocidadActual;
		}

		public void setVelocidadActual(int velocidadActual) {
			this.velocidadActual = velocidadActual;
		}
		
		abstract String acelerar();
		abstract String frenar();
	

}
