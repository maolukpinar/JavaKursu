package Gun50.tasks;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("Tersi alınacak bir sayı giriniz");
        int sayi = oku.nextInt();
        int tersi = 0;
        int yedek=sayi;

        while (sayi > 0)
        {
            int basamak = sayi%10;
            sayi=sayi/10;
            tersi =  tersi * 10 + basamak;
        }
        System.out.println("Sayının      : " + yedek);
        System.out.println("Sayının Tersi: " + tersi);
    }
}

