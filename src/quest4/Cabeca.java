package quest4;

public class Cabeca {
	private int quantCabecas;
	private String corCabelo;
	private int quantChifres;
	
	public int getQuantCabecas() {
		return quantCabecas;
	}
	public void setQuantCabecas(int quantCabecas) {
		this.quantCabecas = quantCabecas;
	}
	public String getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	public int getQuantChifres() {
		return quantChifres;
	}
	public void setQuantChifres(int quantChifres) {
		this.quantChifres = quantChifres;
	}
	
	public Cabeca(int quantCabecas, String corCabelo, int quantChifres) {
		this.quantCabecas = quantCabecas;
		this.corCabelo = corCabelo;
		this.quantChifres = quantChifres;
	}
	
	@Override
	public String toString() {
		return quantCabecas + " cabecas, com cabelos da cor " + corCabelo + " e " + quantChifres + " chifres!";
	}
	
	
}
