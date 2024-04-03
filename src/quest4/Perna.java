package quest4;

public class Perna {
	private int quantPernas;
	private int quantPes;
	private int quantDedos;
	
	public int getQuantPernas() {
		return quantPernas;
	}
	public void setQuantPernas(int quantPernas) {
		this.quantPernas = quantPernas;
	}
	public int getQuantPes() {
		return quantPes;
	}
	public void setQuantPes(int quantPes) {
		this.quantPes = quantPes;
	}
	public int getQuantDedos() {
		return quantDedos;
	}
	public void setQuantDedos(int quantDedos) {
		this.quantDedos = quantDedos;
	}
	
	public Perna(int quantPernas, int quantPes, int quantDedos) {
		super();
		this.quantPernas = quantPernas;
		this.quantPes = quantPes;
		this.quantDedos = quantDedos;
	}
	@Override
	public String toString() {
		return quantPernas + " pernas e " + quantPes + " pes, alem de " + quantDedos + " dedos!";
	}
	
	
}
