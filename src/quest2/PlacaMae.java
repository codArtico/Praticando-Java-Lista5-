package quest2;

public class PlacaMae {
	private String marca;
	private String modelo;
	private int quantNucleos;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQuantNucleos() {
		return quantNucleos;
	}
	public void setQuantNucleos(int quantNucleos) {
		this.quantNucleos = quantNucleos;
	}
	
	public PlacaMae(String marca, String modelo, int quantNucleos) {
		this.marca = marca;
		this.modelo = modelo;
		this.quantNucleos = quantNucleos;
	}
	
	@Override
	public String toString() {
		return "Placa Mae " + marca + " " + modelo + " com " + quantNucleos + " nucleos!";
	}
	
}
