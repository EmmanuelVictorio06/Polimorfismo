public class ContaPremium extends Conta {
    private boolean acessoMusicasOffline;

    public ContaPremium(String nome, String email, boolean acessoMusicasOffline) {
        super(nome, email, "Premium");
        this.acessoMusicasOffline = acessoMusicasOffline;
    }

    @Override
    public void acessarMusicasOffline() {
        System.out.println("Conta Premium tem acesso a músicas offline.");
    }

    public void baixarMusica() {
        if (acessoMusicasOffline) {
            System.out.println("Baixando músicas para ouvir offline.");
        }
    }
}
