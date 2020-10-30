package Gun31ClassAndObject.Tasks.Task1;

import java.util.ArrayList;

public class Task1 {
    //1) create class student with fields; string name, int not
    //2) Daha sonra 3 tane öğrenci ve notu oluşturun ve bu öğrencileri bir ArrayList e ekleyin
    //3) Daha sonra öğrenci bilgilerini yazdıran bir method yazarak, Arraylist teki öğrenci bilgilerini döngü yazdırınız
    //4) Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.

    public static void main(String[] args) {

        Student ogrenci1 = new Student();
        Student ogrenci2 = new Student();
        Student ogrenci3 = new Student();

        ogrenci1.name = "Mehmet";
        ogrenci2.name = "Akif";
        ogrenci3.name = "Pınar";

        ogrenci1.not = 90;
        ogrenci2.not = 80;
        ogrenci3.not = 70;

        ArrayList<Student>ogrenciler=new ArrayList<>();
        ogrenciler.add(ogrenci1);
        ogrenciler.add(ogrenci2);
        ogrenciler.add(ogrenci3);

        BilgiYazdir(ogrenciler);

    }

    public static void BilgiYazdir(ArrayList<Student>ogrenciler)
    {
        for (Student ogr:ogrenciler)
        {
            System.out.println("Öğrenci İsmi : " +ogr.name +"," + " Notu : " +ogr.not);
        }

       /* BilgiYazdir(ogrenciler);

        System.out.println("ortalama = " + OrtalamaBul(ogrenciler));
        System.out.printf("ortalama = %6.2f" , OrtalamaBul(ogrenciler));
    }

    //3.Kısım
    public static void BilgiYazdir(ArrayList<Student> ogrenciler)
    {
        for(Student ogr: ogrenciler)
        {
            System.out.println("ogr.name= " + ogr.name+" Notu="+ogr.not);
        }
    }

    public static double OrtalamaBul(ArrayList<Student> ogrenciler)
    {
        double ort=0;
        double toplam=0;
        for(Student ogr: ogrenciler)
        {
            toplam += ogr.not;
        }

        ort=toplam / ogrenciler.size();

        return ort;


        */

    }
}
