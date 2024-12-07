package cap5.ej3;

public class Main {


	public static void main(String[] args) {
		
		Coche mercedes= new Coche("Clg",30);
		Bicicleta orbea= new Bicicleta("Puerros",15);
		
		System.out.println(mercedes.acelerar());
		System.out.println(orbea.acelerar());
		System.out.println(mercedes.acelerar());
		System.out.println(orbea.frenar());
		System.out.println(mercedes.frenar());
	}

}
