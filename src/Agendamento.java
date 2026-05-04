public class Agendamento {
    private String dataHora;
    private Cliente cliente;
    private Animal pet;
    private String servico;

    public Agendamento(String data, Cliente c, Animal p, String s) {
        this.dataHora = data;
        this.cliente = c;
        this.pet = p;
        this.servico = s;
    }

    public void confirmarServico() {
        System.out.println("Agendamento confirmado para o pet: " + pet);
        cliente.processarPontuacao();
    }
}