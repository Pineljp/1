package cap5.ej2;

public abstract class animal {
	
	private String nombre;

	public animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public animal() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 abstract void emitirSonido() ;

	
	
}
