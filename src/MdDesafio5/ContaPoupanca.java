package MdDesafio5;

public class ContaPoupanca extends ContaBancaria {

    double saldo;
    double depositar;

    public ContaPoupanca(double valor) {
        this.saldo = valor;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getDepositar() {
        return depositar;
    }

    @Override
    public double depositar(double valor) {
        double taxa = 0;

        if(valor > 0){
            this.saldo += valor;
            System.out.println("Voce fez um deposito de " + valor);
            taxa = valor - (valor * 0.01);
            System.out.println("Com as taxas do banco fica " + taxa);
            this.saldo -= taxa;
        }else {
            System.out.println("Valor Invalido");
        }
        return taxa;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é de " + getSaldo());
    };

}


