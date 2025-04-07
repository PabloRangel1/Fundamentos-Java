package HerancaMultipla;

public class Main {
    public static void main(String[] args) {

            // obj Uchiha
            Uchiha sasuke = new Uchiha();
            sasuke.nome = "Sasuke";
            sasuke.idade = 16;
            sasuke.aldeia = "Aldeia da Folha";
            sasuke.habilidadeEspecial();
            sasuke.anbuElite();
            sasuke.rank = NivelNinja.CHUUNIN;

        System.out.println("========================");

            Hatake kt = new Hatake();
            kt.nome = "kakashi";
            kt.idade = 20;
            kt.aldeia = "Aldeia da folha";
            kt.monstrarInformacoes();
            kt.boasVindas();
            kt.habilidadeEspecial();
            kt.anbuElite();


            Uchiha madara = new Uchiha("Madara", 25, "Akatsuki", 900,NivelNinja.KAGE);
            madara.monstrarInformacoes();
            madara.inteligenciaDeCombate();
            madara.inteligenciaDeCombate(50);
        System.out.println("*********************************");
            Uzumaki naruto = new Uzumaki("Naruto", 25, "Folha", NivelNinja.KAGE, 999);
            naruto.monstrarInformacoes();


    }
}
