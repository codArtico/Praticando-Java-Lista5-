package quest3;

public class Editora {
	private String nome;
	private String pais;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public Editora(String nome, String pais) {
		this.nome = nome;
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return "Editora: Editora " + nome + ", do(a) " + pais;
	}
	
	
	
	
}
