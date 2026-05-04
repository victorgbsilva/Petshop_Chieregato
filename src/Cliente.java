public class Cliente extends Usuario implements IFidelidade {
    private int contadorBanhos = 0;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirPerfil() {
        System.out.println("LOG: Acesso do Cliente - " + this.nome);
    }

    @Override
    public void processarPontuacao() {
        this.contadorBanhos++;
        if (this.contadorBanhos >= 8) {
            System.out.println("BÔNUS: Cliente atingiu 8 banhos. Próximo banho é GRATUITO!");
            this.contadorBanhos = 0;
        }
    }

    public int getContadorBanhos() {
        return contadorBanhos;
    }

    public void setContadorBanhos(int contadorBanhos) {
        this.contadorBanhos = contadorBanhos;
    }
}