package Mentor.Meryem.Polymorphism.Ornek1;

public class ulkelerMain {
    public static void main(String[] args) {

        ulkeler ulkeler = new ulkeler();
        ulkeler.isimler();
        ulkeler almanya = new Almanya();
        almanya.isimler();
        ulkeler ingiltere = new ulkeler();
        ingiltere.isimler();
    }
}
