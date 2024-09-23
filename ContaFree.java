public class ContaFree extends Conta {
    private int limiteMusicasPorHora;

    public ContaFree(String nome, String email, int limiteMusicasPorHora) {
        super(nome, email, "Free");
        this.limiteMusicasPorHora = limiteMusicasPorHora;
    }

    @Override
    public void acessarMusicasOffline() {
        System.out.println("Conta Free não tem acesso a músicas offline.");
    }

    public void exibirLimiteMusicas() {
        System.out.println("Você pode ouvir até " + limiteMusicasPorHora + " músicas por hora.");
    }
}
