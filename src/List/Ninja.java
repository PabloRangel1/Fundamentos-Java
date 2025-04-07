package List;

public class Ninja {
        //TODO:  -> Incluir dois novo: numerosDeMissoes e nivel;
        //TODO: Rank -> Gennin,Chunnin,Jounnin, Hokage
        String nome;
        int idade;
        String aldeia;
        int numeroDeMissoes;

        public Ninja(){

        }
        public Ninja(String nome, int idade, String aldeia) {
            this.nome = nome;
            this.idade = idade;
            this.aldeia = aldeia;
        }


        public void monstrarInformacoes(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Aldeia: " + aldeia);
            System.out.println("N° de missões: " + numeroDeMissoes);
        }


}
