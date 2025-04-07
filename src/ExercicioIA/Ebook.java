package ExercicioIA;

public class Ebook extends Livro {
    //TODO: Adicione uma subclasse  de , com uma propriedade adicional  (PDF, ePub).
    FormatoArquivo arquivo;

    @Override
    public void aplicarDesconto(){
        final int porcentagemm = 10;
        double desconto = preco * ((double) porcentagemm / 100);
        double valorFinal =  preco - desconto;
        System.out.println("Voce teve um desconto de " + porcentagemm + " que equiavela a R$: " + valorFinal);
    }


    @Override
    public void exibirInformacoes(){
        System.out.println("Informações");
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(preco);
        System.out.println(categoria);
        System.out.println(codigoSBN);
        System.out.println(arquivo);
    }

}
