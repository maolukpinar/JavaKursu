package Gun56AbstractOrnekler.Ornek2;

public class Kartal extends Hayvan {
    private static int kartalSayac = 1;

    @Override
    void yiyecegi() {
        System.out.println("et");
    }

    @Override
    void yemeMiktari() {
        System.out.println("Günde 1 kuş");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyak");
    }
}
