package Queue.Exercicios;

public class Cliente {
    private String nome;
    private double mediaAtendimento;

    public Cliente() {
    }

    public Cliente(String nome, double mediaAtendimento) {
        this.nome = nome;
        this.mediaAtendimento = mediaAtendimento;
    }

    public static void adicionaCliente(Queue<Cliente> fila, Cliente cliente) {
        fila.add(cliente);
    }



    public double getMediaAtendimento() {
        return mediaAtendimento;
    }

    public void setMediaAtendimento(double mediaAtendimento) {
        this.mediaAtendimento = mediaAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Tempo Médio: " + mediaAtendimento;
    }
}
