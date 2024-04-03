package quest5;
import quest1.Data;
public class ChefeDepartamento extends Funcionario {
	protected String departamento;
	protected Data dataPromocao;
	protected double gratificacao;
	
	public ChefeDepartamento(String nome, Data dataNasc, String cpf, String matricula, Data dataAdmissao,
			double salario, String departamento, Data dataPromocao, double gratificacao) {
		super(nome, dataNasc, cpf, matricula, dataAdmissao, salario);
		this.departamento = departamento;
		this.dataPromocao = dataPromocao;
		this.gratificacao = gratificacao;
	}
	
	 @Override
	    public String toString() {
	        return "Nome: " + nome + "\n" +
	                "Data de Nascimento: " + dataNasc + "\n" +
	                "CPF: " + cpf + "\n" +
	                "Matrícula: " + matricula + "\n" +
	                "Data de Admissão: " + dataAdmissao + "\n" +
	                "Salário: " + salario + "\n" +
	                "Departamento: " + departamento + "\n" +
	                "Data de Promoção: " + dataPromocao + "\n" +
	                "Gratificação: " + gratificacao;
	    }
}
