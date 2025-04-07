package ExercicioIA;

import java.sql.SQLOutput;

public class Livro extends Produto implements Vendavel{

    String titulo;
    String autor;
    double preco;
    String categoria;
    String codigoSBN;
    int estoque = 1000;

    //Construtores
    public Livro() {
    }

    public Livro(String titulo, String autor, double preco, String categoria, String codigoSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.categoria = categoria;
        this.codigoSBN = codigoSBN;
    }
    //
    public void exibirInformacoes(){
        System.out.println("Informações");
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(preco);
        System.out.println(categoria);
        System.out.println(codigoSBN);
    }

    //Metodos e parametros
    public void aplicarDesconto(double porcentagem){
        double desconto = preco * (porcentagem / 100);
        double valorFinal =  preco - desconto;
        System.out.println("Voce teve um desconto de " + porcentagem + " que equiavela a R$: " + valorFinal);
    }

    public void aplicarDesconto(){
        final int porcentagemm = 5;
        double desconto = preco * ((double) porcentagemm / 100);
        double valorFinal =  preco - desconto;
        System.out.println("Voce teve um desconto de " + porcentagemm + " que equiavela a R$: " + valorFinal);
    }

    final public void calcularImposto(){
        int porcentagem1 = 5;
        double valorImposto = preco * ((double) porcentagem1 / 100);
        System.out.println("retorna 5% do valor do livro -> " + valorImposto);
    }

    public int vender(int qtdAVender){
        System.out.println("Foi vendido " + qtdAVender + " livros");
        estoque-= qtdAVender;
        System.out.println("Estoque atual: " + estoque);
        return estoque;
    }

    public void calcularFrete(){
        final int frete = 10;
        System.out.println("Valor Frete: " + 10);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\n' +
                ", autor='" + autor + '\n' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\n' +
                ", codigoSBN='" + codigoSBN + '\n' +
                '}';
    }
}
