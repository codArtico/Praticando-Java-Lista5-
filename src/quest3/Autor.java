package quest3;

public class Autor {
	private String nome;
	private String nacionalidade;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Autor(String nome, String nacionalidade, String sobrenome) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString() {
		return "Autor: " + sobrenome + ", " + nome + " / " + nacionalidade;
	}
	
	
}
