package Gun51.Polymorphism.Ornek2;

import java.util.concurrent.Callable;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("Özal","Artı","Öğrenci","4a");
        Calisan cal1 = new Calisan("Faruk","Eksi","Öğretmen","Eğitim");

        Kisi.kimlikYaz(ogr1);
        System.out.println("-------------");
        Kisi.kimlikYaz(cal1);


        //ogr1 nesnesinin ait olduğu class ın basit adını verir
        System.out.println(ogr1.getClass().getSimpleName());

        //ogr1 nesnesinin ait olduğu class ın üst calss ının basit adı
        System.out.println(ogr1.getClass().getSuperclass().getSimpleName());

    }
}
