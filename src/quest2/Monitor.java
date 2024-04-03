package quest2;

public class Monitor {
	private String marca;
	private boolean status;
	private String conexao;
	private int quantHz;
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getConexao() {
		return conexao;
	}
	public void setConexao(String conexao) {
		this.conexao = conexao;
	}
	public int getQuantHz() {
		return quantHz;
	}
	public void setQuantHz(int quantHz) {
		this.quantHz = quantHz;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Monitor(boolean status, String conexao, int quantHz) {
		this.status = status;
		this.conexao = conexao;
		this.quantHz = quantHz;
	}
	
	
	public Monitor(String marca, boolean status, String conexao, int quantHz) {
		this.marca = marca;
		this.status = status;
		this.conexao = conexao;
		this.quantHz = quantHz;
	}
	
	@Override
	public String toString() {
		return "Monitor " + marca + " com conexao " + conexao + " " + quantHz + "Hz esta: ";
	}
}

