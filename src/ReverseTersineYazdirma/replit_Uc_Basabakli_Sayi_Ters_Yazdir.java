package ReverseTersineYazdirma;

import java.util.Scanner;

public class replit_Uc_Basabakli_Sayi_Ters_Yazdir {
    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
        System.out.print("Üç basamaklı bir sayı giriniz : ");
            int sayi=input.nextInt();


            int a=sayi%10; // birler
            int b=sayi/10%10; // onlar
            int c=sayi/100; //yuzler

            int son=(a*100+b*10+c);
            System.out.print(son);
    }
}
