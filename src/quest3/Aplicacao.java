package quest3;

public class Aplicacao {
	public static void main(String[] args) {
		Titulo titulo = new Titulo("Foi por amor", 1944);
		Autor autor = new Autor("Raul","Brasileiro","Sousa");
		Editora editora = new Editora("Savitar","Brasil");
		Capitulo capitulo = new Capitulo(2,"A crucificacao");
		System.out.println("Livro: ");
		System.out.println(" ");
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(editora);	
		System.out.println(capitulo);
	}
	
}
