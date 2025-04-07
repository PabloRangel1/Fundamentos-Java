package ExercicioIA;

public class Carro {

    String marca;
    String modelo;
    int ano;

    public void modelAndYear(String modelo, int ano){
        System.out.println("Realiazando troca de modelo e ano");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void  mostrarInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }




}
