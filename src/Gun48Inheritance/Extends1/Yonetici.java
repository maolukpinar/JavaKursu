package Gun48Inheritance.Extends1;

public class Yonetici {
    String ad;
    String soyad;
    int yas;
    double maas;
    String departman;
    int sicilNo;
    int bagliPersonel;
    double gorevTazminati;

    public double getMaas()
    {
        return this.maas;
    }

    public void zamYap(int yuzde)
    {
        System.out.println(yuzde + " personele zam yapıldı");
    }
}
