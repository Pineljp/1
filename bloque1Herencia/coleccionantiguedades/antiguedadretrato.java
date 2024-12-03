package bloque1Herencia.coleccionantiguedades;

public class antiguedadretrato {
	private int codigo;
	private String nombre;
	private int precio;
	private String autor;
	public antiguedadretrato(int codigo, String nombre, int precio, String autor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.autor = autor;
	}
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "antiguedadretrato [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", autor=" + autor
				+ "]";
	}
	
	
}
