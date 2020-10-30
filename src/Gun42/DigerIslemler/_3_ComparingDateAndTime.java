package Gun42.DigerIslemler;

import java.time.LocalDate;

public class _3_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);
        
        boolean after = bugun.isAfter(dun);//bugün dünden sonra mı?
        System.out.println("after = " + after);
        
        boolean before = bugun.isBefore(dun);//bugün dünden önce mi?
        System.out.println("before = " + before);
        
        boolean equal = bugun.isEqual(dun);//bugün düne eşit mi?
        System.out.println("equal = " + equal);
        
        boolean leapYear = bugun.isLeapYear();//bugün Artık Yıl mı?
        System.out.println("leapYear = " + leapYear);
        
        int fark = bugun.compareTo(dun.plusYears(-2));//iki tarih arasındaki farkın en büyük parçası arasındaki farkı verir
        System.out.println("fark = " + fark);

        /*
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu içi
        */
    }
}
