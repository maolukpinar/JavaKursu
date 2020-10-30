package Gun38.FinalModifier.example;

public class Ex1 {
    public static void main(String[] args) {
        //bir dairenin alanı pi*r*r dir.

        int yaricap=4;
        double alan =4 * Constans.pi;


//Kullanıcıdan alacağınız saat,dakika ve gün bilgisini
        //saniyeye çeviriniz


        int gun= 23;
        int saat=7;
        int dakika=25;

     int saniyeCinsinden = gun * Constans.hourIndDay *Constans.minuteInHour* Constans.secondInMinute+
                saat* Constans.minuteInHour* Constans.secondInMinute+
                dakika * Constans.secondInMinute;

        System.out.println("saniyeCinsinden = " + saniyeCinsinden);

    }
}
