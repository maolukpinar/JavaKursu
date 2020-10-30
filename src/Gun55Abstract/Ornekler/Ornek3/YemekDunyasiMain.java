package Gun55Abstract.Ornekler.Ornek3;

public class YemekDunyasiMain {
    public static void main(String[] args) {
        Baklava baklava = new Baklava();
        baklava.madeIn();
        baklava.taste();
        System.out.println();

        System.out.println();

     CheeseCake cc = new CheeseCake();
     cc.madeIn();
     cc.taste();

        System.out.println("");

     GreekSalad gs = new GreekSalad();
     gs.madeIn();
     gs.taste();

        System.out.println();

     SezarSalad ss = new SezarSalad();
     ss.madeIn();
     ss.taste();


    }
}
