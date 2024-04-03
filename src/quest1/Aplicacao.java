package quest1;

public class Aplicacao {

	public static void main(String[] args) {
		Contato contato = new Contato("4002-8922","(87)94002-8922","playstation2@sbtmail.silvio");
		Data dataNasc = new Data(15,12,2004);
		Endereco endereco = new Endereco("Aquela la",2,"favelinha","Patos","PB","01234-567");
		Pessoa pessoa = new Pessoa ("Abu",dataNasc,endereco,contato);
		
		System.out.println(pessoa);
	}

}
