package Records;

public record NinjaRecord(String nome, String email, int telefone) {

    // todos os atributos sao FINAL por padrão

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }

}
