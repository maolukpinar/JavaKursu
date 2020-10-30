package Mentor.Zeynep;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void bugununTarihi(){

        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);

        DateTimeFormatter formatliTarih = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String format = tarih.format(formatliTarih);
        System.out.println("format edilmiş hali :"+format);
    }




    public static void bugununSaati() {


        LocalTime suankiSaat = LocalTime.now();

        System.out.println("Formatsiz hali : " + suankiSaat);

        DateTimeFormatter formatliSaat = DateTimeFormatter.ofPattern("hh:ss a");
        String format = suankiSaat.format(formatliSaat);
        System.out.println("Formatli saat : " +format);
    }




    public static void main(String[] args) {


        bugununTarihi();
        bugununSaati();




    }
}
