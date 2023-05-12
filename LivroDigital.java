public class LivroDigital extends Livro {
    private String formato;

    public LivroDigital(String titulo, String autor, int anoPublicacao, double preco, String formato) {
        super(titulo, autor, anoPublicacao, preco);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void imprimirFormato() {
        System.out.println("Formato: " + formato);
    }

    public double calcularTamanhoArquivo(int numPaginas) {
        double tamanhoArquivo = numPaginas * 2.5 / 1024;
        return tamanhoArquivo;
    }
}
