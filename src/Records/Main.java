package Records;

public class Main {

    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 188889999);
        System.out.println("Cadastro = "  + cadastro);

        NinjaRecord record = new NinjaRecord("Sasuke", "ssuke@gmail.com", 1298146034);

        System.out.println("Record -> " + record.emailCaixaAlta());

    }
}
