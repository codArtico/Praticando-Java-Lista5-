package quest5;
import quest1.Data;

public class Aluno extends Pessoa {
	protected String matricula;

	public Aluno(String nome, Data dataNasc, String cpf, String matricula) {
		super(nome, dataNasc, cpf);
		this.matricula = matricula;
	}
	
	public String toString() {
        return "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNasc + "\n" +
                "CPF: " + cpf + "\n" +
                "Matrícula: " + matricula;
    }
}
