package quest4;

public class Boca {
	private int quantBocas;
	private String corBocas;
	private int quantDentes;
	
	public int getQuantBocas() {
		return quantBocas;
	}
	public void setQuantBocas(int quantBocas) {
		this.quantBocas = quantBocas;
	}
	public String getCorBocas() {
		return corBocas;
	}
	public void setCorBocas(String corBocas) {
		this.corBocas = corBocas;
	}
	public int getQuantDentes() {
		return quantDentes;
	}
	public void setQuantDentes(int quantDentes) {
		this.quantDentes = quantDentes;
	}
	
	public Boca(int quantBocas, String corBocas, int quantDentes) {
		super();
		this.quantBocas = quantBocas;
		this.corBocas = corBocas;
		this.quantDentes = quantDentes;
	}
	
	@Override
	public String toString() {
		return quantBocas + " bocas da cor " + corBocas + " e " + quantDentes + " dentes!";
	}
	
	
	
}
