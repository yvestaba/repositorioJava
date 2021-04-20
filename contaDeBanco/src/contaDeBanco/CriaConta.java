package contaDeBanco;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;
		segundaConta.deposita(50);
		System.out.println(segundaConta.saldo);
		
		segundaConta.saca(20);
		System.out.println(segundaConta.saldo);
		
		segundaConta.transfere(100, primeiraConta);
		System.out.println("Saldo segunda conta: " +segundaConta.saldo);
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
	}

}
