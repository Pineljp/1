package bloque1Herencia.coleccionantiguedades;

public class antiguedadestatuilla {
	private int codigo;
	private String nombre;
	private int precio;
	private String autor;
	private int tamaño;
	public antiguedadestatuilla(int codigo, String nombre, int precio, String autor, int tamaño) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.autor = autor;
		this.tamaño = tamaño;
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
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "antiguedadestatuilla [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", autor="
				+ autor + ", tamaño=" + tamaño + "]";
	}
	
}
