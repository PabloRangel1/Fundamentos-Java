package Construtores;

public class Missoes {
    String nome;
    RankDeMissao rank;

    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + " Rank: " + rank + " Descrição: " + rank.getDescricao()) ;
    }

    public Missoes(String nome, RankDeMissao rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissao getRank() {
        return rank;
    }

    public void setRank(RankDeMissao rank) {
        this.rank = rank;
    }
}
