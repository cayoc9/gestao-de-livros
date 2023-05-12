public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("A Revolta de Atlas", "Ayn Rand", 1957, 59.90);
        livro.imprimirInformacoes();
        double precoFinal = livro.calcularPrecoFinal(10);
        System.out.println("Preço Final com 10% de Desconto: R$ " + precoFinal);
        System.out.println();

        LivroFisico livroFisico = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 89.90, 1.2);
        livroFisico.imprimirInformacoes();
        livroFisico.imprimirPeso();
        double frete = livroFisico.calcularFrete(5);
        System.out.println("Frete: R$ " + frete);
        System.out.println();

        LivroDigital livroDigital = new LivroDigital("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 39.90, "PDF");
        livroDigital.imprimirInformacoes();
        livroDigital.imprimirFormato();
        double tamanhoArquivo = livroDigital.calcularTamanhoArquivo(223);
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
    }
}
