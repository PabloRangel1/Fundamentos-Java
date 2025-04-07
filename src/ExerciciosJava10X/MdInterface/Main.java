package ExerciciosJava10X.MdInterface;

public class Main {
    public static void main(String[] args) {

        //naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "naruto";
        naruto.idade = 18;
        naruto.aldeia = "Folha";
        naruto.uzumakiMethod();

        //Hinata
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata";
        hinata.idade = 18;
        hinata.aldeia = "Dos cegos";
        hinata.hyugaMethod();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki ";
        boruto.aldeia = "Folha";
        boruto.idade = 9;
        boruto.uzumakiMethod();
        boruto.ativarKarma();
        boruto.ativarJougan();

    }

}
