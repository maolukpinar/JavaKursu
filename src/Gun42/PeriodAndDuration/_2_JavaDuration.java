package Gun42.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class _2_JavaDuration {
    public static void main(String[] args) {

        LocalTime geceYarisi = LocalTime.of(0,0);
        LocalTime ogleVakti = LocalTime.of(13,3,2,5);

        Duration fark = Duration.between(geceYarisi, ogleVakti);
        System.out.println("fark = " +fark);
        System.out.println("fark = " +fark.toMillis());

        System.out.println("Hours = " + fark.toHours());//gun dahil toplam saati verir
        System.out.println("Minutes = " +fark.toMinutes());//saat dahil toplam dakikayı verir
        System.out.println("Days = " + fark.toDays());

        System.out.println("HoursPart =" + fark.toHoursPart()); //sadece saati verir günü eklemez
        System.out.println("MinutesPart =" + fark.toMinutesPart());//sadece dakikayı verir saati eklemez
        System.out.println("Seconderspart ="  +fark.toSecondsPart());
        System.out.println("MillisPart ="  +fark.toMillisPart());
    }
}
