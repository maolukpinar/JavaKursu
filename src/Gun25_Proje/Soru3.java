package Gun25_Proje;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

/*Soru 3:
SubtractionSquare:
   getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları
   toplayıp çıkan sonucun karesini döndüren bir metod yazınız.

   substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.

   main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de
   getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
   main metodundan yazdırınız.

Örnek:

    int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir

    int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250

    return 3250


 */


            Scanner oku=new Scanner(System.in);
            System.out.print("1. sayiyi giriniz: ");
            int sayi1=oku.nextInt();
            System.out.print("2. sayiyi giriniz: ");
            int sayi2=oku.nextInt();

            System.out.println(substSquare(getSumOfSquares(sayi1),getSumOfSquares(sayi2)));

        }
        public static int getSumOfSquares(int sayi){
            int value=0;
            int toplam=0;
            for (int i = 0; i <=sayi; i++) {
                toplam+=i;
            }
            value=toplam*toplam;

            return value;
        }
        public static int substSquare(int toplam1,int toplam2){

            int value=0;
            int topla1=0 ,topla2=0;
            //topla1=getSumOfSquares(toplam1);
            // topla2=getSumOfSquares(toplam2);
            value=toplam1+toplam2;

            return value;
    }
}
