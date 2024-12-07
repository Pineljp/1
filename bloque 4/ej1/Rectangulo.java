package cap5.ej1;

public class Rectangulo extends Figura {
	
	
	private float altura;
	private float ancho;

	
	
	public Rectangulo() {
		super();
	}


	public Rectangulo(float altura, float ancho) {
		super();
		this.altura = altura;
		this.ancho = ancho;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getAncho() {
		return ancho;
	}


	public void setAncho(float ancho) {
		this.ancho = ancho;
	}


	public float calculararea() {
		
		float a= altura*ancho;
		
		
		return a;
	}

	
	public float calcularperimetro() {
	
		float p= 2*altura+2*ancho;
		
		return p;
	}

}
