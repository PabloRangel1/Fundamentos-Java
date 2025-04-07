package MdDesafio5;

public class ContaCorrente extends ContaBancaria{

    double saldo;
    double depositar;

    public ContaCorrente(double valor) {
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
    public double depositar(double valor){

        if(valor > 0 ){
            this.saldo += valor;
            System.out.println("Deposito Efetuado com o sucesso no valor de: " + valor);
        }else {
            System.out.println("Valor do deposito Invalido");
        }
        return valor;
    };

    @Override
    public  void consultarSaldo(){
        System.out.println("Seu saldo atual é de: " + getSaldo());
    };
}
