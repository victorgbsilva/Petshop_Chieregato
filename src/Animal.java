public class Animal {
    private String nome;
    private String porte;

    public Animal(String nome, String porte) {
        this.nome = nome;
        this.porte = porte;
    }
    @Override
    public String toString() {
        return nome + " (" + porte + ")";
    }
}