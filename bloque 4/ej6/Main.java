package cap5.ej6;

public class Main {


	public static void main(String[] args) {
		Cuenta a= new Cuenta(111);
		Cuenta b= new Cuenta(222);
		Cuenta c= new Cuenta(333);
		Cuenta d= new Cuenta(444);
		
		System.out.println("La tasa de interes actual de la Cuenta a es " + a.calculaInteres());
		System.out.println("La tasa de interes actual de la Cuenta a es " + b.calculaInteres());
		System.out.println("La tasa de interes actual de la Cuenta a es " + c.calculaInteres());
		System.out.println("La tasa de interes actual de la Cuenta a es " + d.calculaInteres());
		
		System.out.println("Se esta procediendo a cambiar la tasa de interes de todas las cuentas del banco");
		Banco.cambiarTasaDeInteres(2);
		
		System.out.println("La tasa de interes actual de la Cuenta a es " + a.calculaInteres());
		System.out.println("La tasa de interes actual de la Cuenta a es " + b.calculaInteres());
		System.out.println("La tasa de interes actual de la Cuenta a es " + c.calculaInteres());
		System.out.println("La tasa de interes actual de la Cuenta a es " + d.calculaInteres());
	}

}
