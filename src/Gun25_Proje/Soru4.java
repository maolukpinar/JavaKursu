package Gun25_Proje;

public class Soru4 {


        /*Soru 4:
ThreeEvenOdd
  threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
  gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
  false göndersin.

  Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı


         */

        public static boolean threeEvenOdd(int[] intArray) {
            boolean x;
            int ciftsayisi=0;
            int teksayisi=0;
            for (int i = 0; i <intArray.length ; i++) {
                if(intArray[i]%2==0)
                    ciftsayisi++;
                else
                    teksayisi++;

            }

            if(ciftsayisi==3 || teksayisi==3)
                x = true;
            else
                x = false;

            return x;
        }

        public static void main(String[] args) {
            int[] inta = {2,1,2,5};
            System.out.println(threeEvenOdd(inta));

        }


    }

