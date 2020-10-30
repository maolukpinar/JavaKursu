package Gun49Inheritance.task1;

public class Sekil {
    // 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
    //Şekil
    //Çember
    //Dikdörtgen
    //Kare

    // 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
    // 3- Her bir sınıfa consructor ekleyiniz.
    // 4- Her metodun toStringini override yapınız.
    // 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
    // 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
    // 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hta mesajı ürettiriniz.


    @Override
    public String toString() { return "Sekil : Bilgi yok ";
    }

    public double getAlan()
    {
        return 0;
    }

    public  double getCevre()
    {
        return 0;
    }

}