package Gun51.Polymorphism.Ornek2;

public class Ogrenci extends Kisi {
   private String sube;

    public Ogrenci(String ad, String soyod, String gorev, String sube) {
        super(ad, soyod, gorev);
        this.sube = sube;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
