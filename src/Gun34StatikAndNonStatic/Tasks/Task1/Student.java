package Gun34StatikAndNonStatic.Tasks.Task1;

import java.util.ArrayList;

public class Student {
    String name;
    int maxAlabilecegiDerssaatiMiktari;

    ArrayList<Lesson> StudentLessons = new ArrayList<>();

    public static Student createStudent(String name, int maxAlabilecegiDerssaatiMiktari) {
        Student ogr = new Student();
        ogr.name = name;
        ogr.maxAlabilecegiDerssaatiMiktari = maxAlabilecegiDerssaatiMiktari;
        return ogr;

    }

    public void lessonAdd(Lesson ders) {
        int ogrenciToplamDersSaati = 0;
        // öğrencinin bu ana kadar aldığı derslerin saatlerinin toplamı
        for (Lesson aldigiDers : StudentLessons) {
            ogrenciToplamDersSaati += aldigiDers.hour;
        }

        if (ogrenciToplamDersSaati + ders.hour < maxAlabilecegiDerssaatiMiktari) {
            StudentLessons.add(ders);
        } else {
            System.out.println(name + " " + ders.name + " Max saati aştınız.ders Eklenemez");


        }
    }


    public void printLessons() {
        System.out.println(name + " isimli öğrencinin aldığı dersler");

        int aldigiToplamSaat = 0;
        for (Lesson ders : StudentLessons) {
            System.out.println(ders.name + " " + ders.hour);
            aldigiToplamSaat += ders.hour;
        }
        System.out.println("aldigiToplamSaat = " + aldigiToplamSaat);


    }
}