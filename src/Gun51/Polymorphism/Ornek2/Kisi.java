package Gun51.Polymorphism.Ornek2;

public class Kisi {
    private String ad, soyod, gorev;

    public Kisi(String ad, String soyod, String gorev) {
        this.ad = ad;
        this.soyod = soyod;
        this.gorev = gorev;
    }

    public static void kimlikYaz(Kisi kisi)
    {
        System.out.println("Ad = "+kisi.ad);
        System.out.println("Soyad = "+kisi.soyod);
        System.out.println("Görev = "+kisi.gorev);

        //1.yol
        if(kisi instanceof Ogrenci)
            System.out.println("Şubesi :" +((Ogrenci) kisi).getSube());

        if(kisi instanceof Calisan)
            System.out.println("Departmanı :" +((Calisan) kisi).getDepartman());

        //2.Yol
        if (kisi.getClass().getSimpleName().equalsIgnoreCase("Ogrenci"))
        {
            System.out.println("Şubesi ="+ ((Ogrenci)kisi).getSube() );
        }

        if (kisi.getClass().getSimpleName().equalsIgnoreCase("Calisan"))
        {
            System.out.println("Departmanı ="+ ((Calisan)kisi).getDepartman() );
        }
    }

}
