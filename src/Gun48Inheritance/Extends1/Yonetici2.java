package Gun48Inheritance.Extends1;

public class Yonetici2 extends Personel{

    int bagliPersonel;
    double gorevTazminati;



    public void zamYap(int yuzde)
    {

        System.out.println(yuzde + " personele zam yapıldı");


    }

// todo Yonetici class da hepsini tek tek yaptik. Ama Yonetici2 classta
    //  miras yontemi ile  daha kolay bir yontem oldu
    //  Yoneticide bir personel oldugu icin sadece Yoneticiye eklenecekleri ekledik

}



