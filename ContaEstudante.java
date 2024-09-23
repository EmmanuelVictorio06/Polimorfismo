public class ContaEstudante extends Conta {
    private String instituicaoEducacional;

    public ContaEstudante(String nome, String email, String instituicaoEducacional) {
        super(nome, email, "Estudante");
        this.instituicaoEducacional = instituicaoEducacional;
    }

    @Override
    public void acessarMusicasOffline() {
        System.out.println("Conta Estudante tem acesso limitado a músicas offline.");
    }

    public void exibirInstituicao() {
        System.out.println("Instituição de ensino: " + instituicaoEducacional);
    }
}
