package contaDeBanco;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(1234);
		
		Titular yves = new Titular();
		primeiraConta.setTitular(yves);

		//atribuições para titular
		yves.setNome("Yves Taba");
		yves.setCpf("111.111.118-95");
		yves.setProfissao("Programador de back-end");
		
		//informando atribuições do titular na tela
		System.out.println("Nome: " + yves.getNome());
		System.out.println("CPF: " + yves.getCpf());
		System.out.println("Profissão: " + yves.getProfissao());
		System.out.println();
		
		//informando agencia e conta
		
		System.out.println("Número da conta: " + primeiraConta.getNumero());
		System.out.println("Número da agência: " + primeiraConta.getAgencia());
		System.out.println();


		
		//transações

		primeiraConta.deposita(100);
		System.out.print("Depósito na primeira conta realizado com sucesso. Saldo: ");
		System.out.println(primeiraConta.consultaSaldo());
		System.out.println();
		
		
		//criando SEGUNDA CONTA
		//criando SEGUNDA CONTA
		//criando SEGUNDA CONTA
		//criando SEGUNDA CONTA
		Conta segundaConta = new Conta(1234);
		
		Titular artur = new Titular();
		segundaConta.setTitular(artur);

		//atribuições para titular SEGUNDA CONTA
		artur.setNome("Artur Diniz");
		artur.setCpf("121.111.118-99");
		artur.setProfissao("Programador de back-end");
		
		//informando atribuições do titular na tela SEGUNDA CONTA
		System.out.println("Nome: " + artur.getNome());
		System.out.println("CPF: " + artur.getCpf());
		System.out.println("Profissão: " + artur.getProfissao());
		
		System.out.println();
		
		//informando agencia e conta SEGUNDA CONTA
		System.out.println("Número da segunda conta: " + segundaConta.getNumero());
		System.out.println("Número da agência da segunda conta: " + segundaConta.getAgencia());
		System.out.println();
		
		
		//transações SEGUNDA CONTA
		segundaConta.deposita(250);
		System.out.print("Depósito na segunda conta realizado com sucesso. Saldo: ");
		System.out.println(segundaConta.consultaSaldo());
		
		boolean conseguiuSacar = segundaConta.saca(20);
		
			if (conseguiuSacar) {
				System.out.print("Saque realizado com sucesso. Saldo: ");
			} else {
				System.out.print("Saldo insuficiente para a realização do saque. Saque "
						+ "mal sucedido. Saldo atual: ");
			}
		System.out.println(segundaConta.consultaSaldo());
		
		boolean conseguiuTransferir = segundaConta.transfere(100, primeiraConta);
			if (conseguiuTransferir) {
				System.out.println("Transferência realizada com sucesso.");
			} else {
				System.out.println("Saldo insuficiente para realizar transferência.");
			}
		
		System.out.println("Saldo segunda conta: " + segundaConta.consultaSaldo());
		System.out.println("Saldo primeira conta: " + primeiraConta.consultaSaldo());
		System.out.println();
		
		//criando TERCEIRA CONTA
		//criando TERCEIRA CONTA
		//criando TERCEIRA CONTA
		//criando TERCEIRA CONTA
		Conta terceiraConta = new Conta(1234);
		
		Titular xuxa = new Titular();
		terceiraConta.setTitular(xuxa);

		//atribuições para titular TERCEIRA CONTA
		xuxa.setNome("Xuxa Meneghel");
		xuxa.setCpf("111.771.118-35");
		xuxa.setProfissao("Apresentadora de televisão");
		
		//informando atribuições do titular na tela TERCEIRA CONTA
		System.out.println("Nome: " + xuxa.getNome());
		System.out.println("CPF: " + xuxa.getCpf());
		System.out.println("Profissão: " + xuxa.getProfissao());
		System.out.println();
		
		//informando agencia e conta TERCEIRA CONTA
		
		System.out.println("Número da conta: " + terceiraConta.getNumero());
		System.out.println("Número da agência: " + terceiraConta.getAgencia());
		System.out.println();
		
		
		
		
				
	}

}
