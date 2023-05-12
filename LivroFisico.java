public class LivroFisico extends Livro {
    private double peso;

    public LivroFisico(String titulo, String autor, int anoPublicacao, double preco, double peso) {
        super(titulo, autor, anoPublicacao, preco);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void imprimirPeso() {
        System.out.println("Peso: " + peso + " kg");
    }

    public double calcularFrete(double valorFretePorKg) {
        double frete = peso * valorFretePorKg;
        return frete;
    }
}
