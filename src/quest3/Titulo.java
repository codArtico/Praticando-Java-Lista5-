package quest3;

public class Titulo {
	private String titulo;
	private int anoPub;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public Titulo(String titulo, int anoPub) {
		this.titulo = titulo;
		this.anoPub = anoPub;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + ", " + anoPub;
	}
	
	
}
