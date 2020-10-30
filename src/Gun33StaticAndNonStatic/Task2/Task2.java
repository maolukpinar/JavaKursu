package Gun33StaticAndNonStatic.Task2;

import java.util.ArrayList;

public class Task2 {

        // 1 - Bir Üniversitede öğrencilere ders kaydı yapılacaktır
        //     Ders sınıfı ayrı dosyada adı : Lesson, fields : name, credit(1 -3 arasında değer alıyor)
        // 2 - Öğrenci Sınıfı ayrı dosyada adı: Student, fields : name, maxCredit dersleri listesini
        //     tutacak bir liste
        // 3 - 3 adet ders oluşturunuz
        // 4 - 1 adet öğrenci tanımlayınız alabileceği max kredi 10 olsun.
        // 5 - Bu öğrencinin ders listesine açılmış olan dersleri ekleyiniz.
        //     fakat ders eklerken max krediyi geçerse "max kredi doldu" uyarısı versin
        public static void main(String[] args) {

          Lesson mat101=new Lesson();
          mat101.name="Matematik";
          mat101.credit=3;

          Lesson Java101=new Lesson();
          Java101.name="Java Programming";
          Java101.credit=6;

          Lesson fiz101=new Lesson();
          fiz101.name="Fizik";
          fiz101.credit=4;




            Student student1 = new Student();
            student1.name = "Mehmet Akif";
            student1.maxCredit = 10;

            student1.dersListesi=new ArrayList<>();
            //Buraya kontrol konacak toplam aldığı krediye bakılarak
            if(student1.totalCredit()+mat101.credit <= student1.maxCredit) {
                student1.dersListesi.add(mat101);
            }
            else {
                System.out.println("Alabileceğiniz kredi miktarı doldu");
            }

            if(student1.totalCredit()+fiz101.credit <= student1.maxCredit) {
                student1.dersListesi.add(fiz101);

            }
            else {
                System.out.println("Alabileceğiniz kredi miktarı doldu");
            }

            if(student1.totalCredit()+Java101.credit <= student1.maxCredit) {
                student1.dersListesi.add(Java101);
            }
            else {
                System.out.println("Alabileceğiniz kredi miktarı doldu");
            }

    }
}
