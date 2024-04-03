package quest1;

public class Pessoa {
	String nome;
	Data dataNasc;
	Endereco endereco;
	Contato contato;
	
	
	public Pessoa(String nome, Data dataNasc, Endereco endereco, Contato contato) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n" + 
				"Data de nascimento: " + dataNasc + "\n" + "\n" +
				"Endereco: " + "\n" + "\n" +
				endereco + "\n" + "\n" +
				"Contato: " + "\n" + "\n" +
				contato;
	}

	
}
