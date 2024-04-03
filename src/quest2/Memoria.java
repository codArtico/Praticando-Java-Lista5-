package quest2;

public class Memoria {
	private String marca;
	private int quantMem;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantMem() {
		return quantMem;
	}
	public void setQuantMem(int quantMem) {
		this.quantMem = quantMem;
	}
	
	public Memoria(String marca, int quantMem) {
		this.marca = marca;
		this.quantMem = quantMem;
	}
	@Override
	public String toString() {
		return marca +" " + quantMem + "GB de memoria";
	}
	
	
	
}
