package Gun44.javaTryCatch;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        try {


            System.out.print("1.Sayıyı giriniz : ");
            int a = oku.nextInt();

            System.out.print("2.Sayıyı giriniz : ");
            int b = oku.nextInt();

            int c = a / b;
            System.out.println("c = " + c);

        }
        catch (Exception hata)//hata olduğunda çalışacak bölüm
        {
            System.out.println("hata oldu");
//            System.out.println("hata = " + hata.getMessage());
  //              hata.printStackTrace();
            System.out.println("Lütfen 2.sayıyı 0 vermeyiniz..");
        }
        //java.util.InputMismatchException  ikinci sayı harf girildiğinde çıkan hata
        //java.lang.ArithmeticException: / by zero  ikinci sayı sıfır girildiğinde çıkan hata





    }
}
