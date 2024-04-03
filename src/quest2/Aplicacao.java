package quest2;

public class Aplicacao {

	public static void main(String[] args) {
		Memoria memoria = new Memoria("Razer",4);
		Monitor monitor = new Monitor("LG",true,"HDMI",120);
		PlacaMae placaMae= new PlacaMae("Intel", "I9-11320", 8);
		Teclado teclado = new Teclado("HyperX","Full",true);
		
		System.out.println("Configuracoes do seu PC: ");
		System.out.println(" ");
		
		System.out.println("Memoria: " + memoria.toString());
		
		if(monitor.getStatus()) {
			System.out.println("Monitor: " + monitor.toString() + "Ligado!");
		}
		else {
			System.out.println("Monitor: " + monitor + "Desligado!");
		};
		System.out.println("Placa-Mae: " + placaMae);
		if(teclado.getRgb()) {
			System.out.println("Teclado: " + teclado + " com RGB");
		}
		else {
			System.out.println("Teclado: " + teclado + " sem RGB");
		};
		
	}

}
