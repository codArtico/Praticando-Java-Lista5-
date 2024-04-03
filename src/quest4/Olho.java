package quest4;

public class Olho {
	private int quantOlhos;
	private String corOlhos;
	
	public int getQuantOlhos() {
		return quantOlhos;
	}



	public void setQuantOlhos(int quantOlhos) {
		this.quantOlhos = quantOlhos;
	}



	public String getCorOlhos() {
		return corOlhos;
	}



	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	
	public Olho(int quantOlhos, String corOlhos) {
		super();
		this.quantOlhos = quantOlhos;
		this.corOlhos = corOlhos;
	}

	@Override
	public String toString() {
		return quantOlhos + " olhos da cor " + corOlhos;
	}
}
