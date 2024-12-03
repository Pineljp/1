package bloque1Herencia.articuloscomestibles;

public class articulos{
	private int codigo;
	private String nombre;
	private int precio;
	private String fecha;
	
	
	public articulos(int codigo, String nombre, int precio, String fecha) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha = fecha;
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


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "articulos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fecha=" + fecha + "]";
	}


	
}
