package quest5;
import quest1.Data;

public class Funcionario extends Pessoa {
	protected String matricula;
	protected Data dataAdmissao;
	protected double salario;
	
	public Funcionario(String nome, Data dataNasc, String cpf, String matricula, Data dataAdmissao, double salario) {
		super(nome, dataNasc, cpf);
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	
	
}
