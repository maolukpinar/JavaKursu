package ReverseTersineYazdirma;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("Tersi alınacak bir sayı giriniz=");
        int sayi=oku.nextInt();
        int tersSayi=0;  //Ters sayıyı en başta 0 kabul ettik.



        while (sayi > 0)
        {                                  // Örnek; sayımız 23452 ise  -> 2  -> 0*10 +2  = 2
            int basamak = sayi%10;         // Kalanı veren teknik ile son basamağı aldık. --> 2
            sayi=sayi/10;                  // Sayıyı 10'a bölerek bölümü aldık. Yani son basamak dışındakileri. --> 2345
            tersSayi =  tersSayi * 10 + basamak;  // 0 * 10 + 2 = 2 (Aşağıdaki tablonun il satırı böyle oluşur ve döngü devam eder.)
        }

        // Örnek; sayımız 23452 ise
        //    basamak  sayı     tersSayı
        // 1-     2     2345       2
        // 2-     5     234        25
        // 3-     4     23         254
        // 4-     3     2          2543
        // 5-     2     0          25432

    }

}
