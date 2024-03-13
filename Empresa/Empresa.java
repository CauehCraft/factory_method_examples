
public class Empresa {
	public static void main(String args[]) {
		PessoaFactory factory = new CadastroPessoas();

		Pessoa pessoa1 = factory.criarPessoa("Funcionario");
		Pessoa pessoa2 = factory.criarPessoa("Gerente");

		pessoa1.exibirInfo();
		pessoa2.exibirInfo();
	}
}
