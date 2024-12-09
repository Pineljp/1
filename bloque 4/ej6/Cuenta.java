package cap5.ej6;

public class Cuenta {

	double Saldo;
	

	public Cuenta() {
		super();
	}

	public Cuenta(double saldo) {
		super();
		Saldo = saldo;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public double calculaInteres() {
		double x = Saldo* Banco.tasaDeInteres ;
		return x;
		
		
	}
	

}
