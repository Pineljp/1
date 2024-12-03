package bloque1Herencia.articuloscomestibles;

public class articulospere{
	private int codigo;
	private String nombre;
	private int precio;

	
	
	public articulospere(int codigo, String nombre, int precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
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





	@Override
	public String toString() {
		return "articulos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}


	
}