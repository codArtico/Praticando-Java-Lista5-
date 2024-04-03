package quest5;
import quest1.Data;
public class Aplicacao {

	public static void main(String[] args) {
		Data dataNascRaul = new Data(15,12,2004);
		Aluno aluno = new Aluno("Raul",dataNascRaul,"123","0404");
		
		Data dataNascChefe = new Data (01,01,2001);
		Data dataAdmissaoChefe = new Data (01,06,2023);
		Data dataPromocaoChefe = new Data (02,04,2024);
		ChefeDepartamento chefeDepartamento = new ChefeDepartamento("Mikaelle",dataNascChefe,"444","02ab",dataAdmissaoChefe,5000.00,"LP2",dataPromocaoChefe,9000.0);
		
		System.out.println("Aluno: ");
		System.out.println(" ");
		System.out.println(aluno);
		
		System.out.println(" ");
		System.out.println("Chefe do departamento: ");
		System.out.println(" ");
		System.out.println(chefeDepartamento);
	}

}
