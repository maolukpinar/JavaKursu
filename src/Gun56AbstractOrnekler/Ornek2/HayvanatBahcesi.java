package Gun56AbstractOrnekler.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        int sayac =1;


        Kedi kedi = new Kedi();
       // kedi.setId();
        kedi.setIsim("Köpük");
        kedi.setVahsi(false);
        kedi.setDogumTarihi(LocalDate.of(2018,1,5));
        System.out.println(kedi);
        kedi.yiyecegi();
        kedi.yemeMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();
        System.out.println();

        Kartal kartal = new Kartal();
        //kartal.setId();
        kartal.setIsim("Tibet");
        kartal.setVahsi(true);
        kartal.setDogumTarihi(LocalDate.of(2015,1,1));
        System.out.println(kartal);
        kartal.yiyecegi();
        kartal.yemeMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();

    }
}
