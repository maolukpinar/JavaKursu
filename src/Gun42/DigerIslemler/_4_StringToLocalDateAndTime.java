package Gun42.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _4_StringToLocalDateAndTime {
    public static void main(String[] args) {
        
        String strDate ="01 25 2020";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate tarih = LocalDate.parse(strDate, format);

        System.out.println("tarih = " + tarih);


        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(" istediğimiz şekilde yazdırma yöntemi = " +tarih.format(format1));

        String strTime ="12:49";
        LocalTime time =LocalTime.parse(strTime);// parse ile string olan zaman bilgisi, LocalTime tipi gerçek zaman değişkenine çevirdik.
        System.out.println("time = " + time);
        
        
    }
}
