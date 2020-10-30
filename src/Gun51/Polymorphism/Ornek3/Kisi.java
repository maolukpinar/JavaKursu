package Gun51.Polymorphism.Ornek3;

import java.util.concurrent.Callable;

public class Kisi {

    private String ad, soyad, gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public void bilgileriYaz() {
        System.out.println("Ad ; " + this.ad);
        System.out.println("Soyad ; " + this.soyad);
        System.out.println("Görevi ; " + this.gorevi);
    }

    public static void kimlikYaz(Object object) {
        if (object instanceof Calisan) {

            Calisan calisan = (Calisan) object;
            calisan.bilgileriYaz();
        } else if (object instanceof Ogrenci) {
            Ogrenci ogrenci = (Ogrenci) object;
            ogrenci.bilgileriYaz();
        }
        else if (object instanceof Kisi){
            Kisi kisi = (Kisi) object;
            kisi.bilgileriYaz();
        }
    }
}

