package contaDeBanco;

public class Titular {
private	String nome;
private	String cpf;
private	String profissao;

public Titular() {
	System.out.println("Criando conta... Dados do titular: ");
}

//getters e setters
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getProfissao() {
	return profissao;
}
public void setProfissao(String profissao) {
	this.profissao = profissao;
}
}
