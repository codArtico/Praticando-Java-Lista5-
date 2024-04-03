package quest4;

public class Braco {
	private int quantBracos;
	private int quantMaos;
	private int quantDedos;
	
	public int getQuantBracos() {
		return quantBracos;
	}
	public void setQuantBracos(int quantBracos) {
		this.quantBracos = quantBracos;
	}
	public int getQuantMaos() {
		return quantMaos;
	}
	public void setQuantMaos(int quantMaos) {
		this.quantMaos = quantMaos;
	}
	public int getQuantDedos() {
		return quantDedos;
	}
	public void setQuantDedos(int quantDedos) {
		this.quantDedos = quantDedos;
	}
	
	public Braco(int quantBracos, int quantMaos, int quantDedos) {
		super();
		this.quantBracos = quantBracos;
		this.quantMaos = quantMaos;
		this.quantDedos = quantDedos;
	}
	
	@Override
	public String toString() {
		return quantBracos + " bracos e " + quantMaos + " maos, alem de " + quantDedos + " dedos!";
	}
	
	
}
