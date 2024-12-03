package bloque1Herencia.coleccionantiguedades;

public class antiguedadjoya {
	private int codigo;
	private String nombre;
	private int precio;
	private String material;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public antiguedadjoya(int codigo, String nombre, int precio, String material) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.material = material;
	}

	@Override
	public String toString() {
		return "antiguedadjoya [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", material="
				+ material + "]";
	}
	
	
}
