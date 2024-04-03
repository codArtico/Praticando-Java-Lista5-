package quest3;

public class Capitulo {
	private int numCapitulo;
	private String nome;
	
	public int getNumCapitulo() {
		return numCapitulo;
	}
	public void setNumCapitulo(int numCapitulo) {
		this.numCapitulo = numCapitulo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Capitulo(int numCapitulo, String nome) {
		this.numCapitulo = numCapitulo;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Capitulo " + numCapitulo + ": '" + nome + "'";
	}
	
	
	
}
