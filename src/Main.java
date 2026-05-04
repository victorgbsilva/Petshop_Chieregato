public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Isadora Chieregato", "123.456.789-00");

        Animal pet1 = new Animal("Thor", "Grande");

        cliente1.exibirPerfil();

        System.out.println("\n--- Iniciando Ciclo de Banhos ---");
        for (int i = 1; i <= 8; i++) {
            System.out.print("Banho nº " + i + ": ");
            cliente1.processarPontuacao();
        }

        Agendamento agenda = new Agendamento("20/02/2026 14:00", cliente1, pet1, "Tosa Completa");

        System.out.println("\n--- Verificação de Agendamento ---");
        agenda.confirmarServico();
    }
}