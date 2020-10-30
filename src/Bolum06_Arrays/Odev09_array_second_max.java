package Bolum06_Arrays;

import java.util.Arrays;

public class Odev09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..

        int [] dizi = {15,25,22,18,30};

        int max = dizi[0];

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i] > max){
                max = dizi[i];
            }
        }

        int max2 =dizi[0];

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i] > max2 && dizi[i]!=max){
                max2 = dizi[i];
            }
        }
        System.out.println(max2);
















     /*   int dizi[] = {15,25,22,18,30};

        int max = dizi[0];

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i] > max){
                max = dizi[i];
            }
        }

        int max2 = dizi[0];
        for (int i=0; i<dizi.length; i++){
            if (dizi[i] > max2 && dizi[i]!=max){
                max2 = dizi[i];
            }

        }
        System.out.println("En büyük 1.max = " + max);
        System.out.println("En büyük 2.max = " + max2);

      */


      /*  int a[] = {15,25,22,18,30};

       int max1, max2;

        max1 = a[0];
        max2 = a[1];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2)
                max2 = a[i];

        System.out.println("Dizinin en buyuk ikinci elemani = " + max2);

       */

    }
}


     /*   Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        System.out.println(dizi[dizi.length-2]);

      */




