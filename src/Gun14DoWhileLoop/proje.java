package Gun14DoWhileLoop;

import java.util.Scanner;

public class proje {

       /* Aşağıda verilen gün adlarına göre, Girilen bir gün numarasına karşılk gelen gün adını yazınız.

        Eger int 1 ise print monday
        Eger int 2 ise print tuesday
        Eger int 3 ise print wednesday
        Eger int 4 ise print thursday
        Eger int 5 ise print friday
        Eger int 6 ise print saturday
        Eger int 7 ise print sunday
        Eger int 8 den buyuk ise  print "this is not a valid day"

        NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN

        TODO ESKİ ÖRNEK SORU AŞAĞIDA


        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo =");
        int gunNo= oku.nextInt();

//        if (gunNo==1)
//            System.out.println("Pazartesi");
//        else
//            if (gunNo=2)
//                System.out.println("Salı");
//            ....

        switch (gunNo)
        {
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Salı"); break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5: // gunNo 5 eşit ise
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı gün no");


         */

        public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir rakam giriniz : ");
            int day = scanner.nextInt();

            //  kodu burdan başlatın ve bu satırdan önceki kodlari degiştirmeyin

            switch (day)
            {
                case 1: System.out.println("Monday");break;
                case 2: System.out.println("Tuesday");break;
                case 3: System.out.println("Wednesday");break;
                case 4: System.out.println("Thursday");break;
                case 5: System.out.println("Friday");break;
                case 6: System.out.println("Saturday");break;
                case 7: System.out.println("Sunday");break;
                default:
                    System.out.println("This is not a valid day");
            }


        }
}
