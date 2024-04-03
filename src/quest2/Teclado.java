package quest2;

public class Teclado {
	private String marca;
	private String tipo;
	private boolean rgb;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean getRgb() {
		return rgb;
	}
	public void setRgb(boolean rgb) {
		this.rgb = rgb;
	}
	
	public Teclado(String marca, String tipo, boolean rgb) {
		this.marca = marca;
		this.tipo = tipo;
		this.rgb = rgb;
	}
	
	@Override
	public String toString() {
		return "Teclado " + marca + " " + tipo;
	}
	
}
