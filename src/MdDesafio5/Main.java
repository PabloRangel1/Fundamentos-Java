package MdDesafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contac = new ContaCorrente(100);
        contac.depositar(400);
        System.out.println("Seu novo saldo é de -> " + contac.getSaldo());

        System.out.println("===========================================================");

        ContaPoupanca contap = new ContaPoupanca(500);
        contap.depositar(100);
        System.out.println("Saldo Atual: " + contap.getSaldo());


    }
}
