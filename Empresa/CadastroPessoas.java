public class CadastroPessoas extends PessoaFactory {
    public Pessoa criarPessoa(String tipo){
        if (tipo.equals("Funcionario")){
            return new Funcionario();
        } else if (tipo.equals("Gerente")){
            return new Gerente();
        }
        return null;
    }
}
