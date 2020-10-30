package Gun51.Polymorphism.Ornek3;

public class OkulMain {
    public static void main(String[] args) {


        Ogrenci ogrenci = new Ogrenci("Mehmet","Akif","Ogrenci","4a");
        Calisan calisan = new Calisan("Ali","Tahsin","Öğretmen","Eğitim");
        Kisi kisi = new Kisi("Mualla","Olukpınar","Sekreter");

        Kisi.kimlikYaz(ogrenci);
        System.out.println("---------------------");
        Kisi.kimlikYaz(calisan);
        System.out.println("-----------------------");
        Kisi.kimlikYaz(kisi);
    }
}
