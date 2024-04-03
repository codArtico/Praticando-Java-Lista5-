package quest4;

public class Aplicacao {
	public static void main(String[] args) {
		Cabeca cabeca = new Cabeca(4,"vermelha",15);
		Olho olho = new Olho(20,"violeta");
		Boca boca = new Boca(15,"verde",500);
		Braco braco = new Braco(12,24,100);
		Perna perna = new Perna(4,8,50);
		
		System.out.println("Seu monstro tem:");
		System.out.println(" ");
		System.out.println(cabeca);
		System.out.println(olho);
		System.out.println(boca);
		System.out.println(braco);
		System.out.println(perna);
	}
}
