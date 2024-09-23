public class Conta {
    protected String nome;
    protected String email;
    protected String tipoConta;

    // Construtor sem parâmetros
    public Conta() {
        this.nome = "Desconhecido";
        this.email = "Desconhecido";
        this.tipoConta = "Free";
    }

    // Construtor com parâmetros
    public Conta(String nome, String email, String tipoConta) {
        this.nome = nome;
        this.email = email;
        this.tipoConta = tipoConta;
    }

    // Método comum a todas as contas
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Email: " + email + ", Tipo de Conta: " + tipoConta);
    }

    // Método que será sobrescrito nas classes filhas
    public void acessarMusicasOffline() {
        System.out.println("Acesso offline não disponível para a conta " + tipoConta);
    }
}
