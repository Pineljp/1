package cap5.ej7;

public class Usuario {

		static int totalUsuarios = 0;

		public Usuario() {
			super();
		}
		
		static public void agregarUsuarios(int usu){
			totalUsuarios = totalUsuarios + usu;
			System.out.println("Se han agregado "+ usu +" usuarios.");
		}
		static	public void eliminarUsuarios(int usu){
			totalUsuarios = totalUsuarios - usu;
			if (totalUsuarios < 0) {
				totalUsuarios = 0;
			}
			System.out.println("Se han eliminado "+ usu +" usuarios.");
		}
		
		
		
		
		
		


}
