package ExercicioIA;

public class Main {
    public static void main(String[] args) {

        Livro ia = new Livro();
        ia.titulo = "NanoMachine";
        ia.autor = "China1";
        ia.preco = 1000;
        ia.categoria = "Manwha";
        ia.codigoSBN = "1999";
        ia.exibirInformacoes();
        ia.aplicarDesconto(10);
        ia.calcularFrete();
        ia.aplicarDesconto();
        ia.aplicarDesconto(20);
        ia.calcularImposto();

        System.out.println("--------------------------------------------------");

        Ebook eb = new Ebook();
        eb.titulo = "Solo Leving";
        eb.autor = "Chugong";
        eb.preco = 1200;
        eb.categoria = "Manwha";
        eb.codigoSBN = "2000";
        eb.arquivo = FormatoArquivo.PDF;
        eb.exibirInformacoes();


//        Livro livro2 = new Livro();
//        livro2.titulo = "Solo Leveling";
//        livro2.autor = "Chugong";
//        livro2.preco = 1200;
//        livro2.categoria = "Manwha";
//        livro2.codigoSBN = "2000";
//
//        Livro livro3 = new Livro();
//        livro3.titulo = "O Hobbit";
//        livro3.autor = "J.R.R. Tolkien";
//        livro3.preco = 89.90;
//        livro3.categoria = "Fantasia";
//        livro3.codigoSBN = "3001";
//
//        // Exibindo informações dos livros
//        System.out.println("Livro 1: " + ia.titulo + " - " + ia.autor);
//        System.out.println("Livro 2: " + livro2.titulo + " - " + livro2.autor);
//        System.out.println("Livro 3: " + livro3.titulo + " - " + livro3.autor);

    }
}
