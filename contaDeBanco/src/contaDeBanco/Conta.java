package contaDeBanco;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Titular titular;
	private static int total;
	
	public Conta (int agencia) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = Conta.total;
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public double consultaSaldo () {
		return this.saldo;
	}
	
	//getters and setters
	
	public int getNumero () {
		return this.numero;
	}	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
