package Conteudo;

public enum Bijus {

    SSHUKAKU( "Shukaku","Gaara",1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);


    String nomeBiju;
    String jinchuriki;
    int nmDeCaldas;

    Bijus() {
    }

    Bijus(String nomeBiju, String jinchuriki, int nmDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.nmDeCaldas = nmDeCaldas;
    }
}
