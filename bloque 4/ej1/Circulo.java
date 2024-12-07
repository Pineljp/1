package cap5.ej1;

public class Circulo extends Figura {
	
	private float radio;

	
	
	public Circulo() {
		super();
	}

	public Circulo(float radio) {
		super();
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	

	@Override
	public float calculararea() {
		double a = radio*Math.PI*radio;
		
		float fa = (float) (radio*Math.PI*radio);
		
		return fa;
	}

	@Override
	public float calcularperimetro() {
		double p = radio*Math.PI*2;
		
		float fp = (float)p;
		
		return fp;
	}

}
