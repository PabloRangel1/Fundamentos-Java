package ClasseAbstrata;

public abstract class Hokage {

    private String nome;
    private int idade;
    private boolean vivoOuNao;
    private String aldeia;
    private int missoes;
    private double saldoBancario;
    private double altura;

    public abstract void sabedoria();

    public Hokage(){

    }

    public Hokage(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    public Hokage(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVivoOuNao() {
        return vivoOuNao;
    }

    public void setVivoOuNao(boolean vivoOuNao) {
        this.vivoOuNao = vivoOuNao;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getMissoes() {
        return missoes;
    }

    public void setMissoes(int missoes) {
        this.missoes = missoes;
    }

    public double getSaldoBancario() {
        return saldoBancario;
    }

    public void setSaldoBancario(double saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
