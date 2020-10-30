package Bolum06_Arrays;

import java.util.Arrays;

public class Odev08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int dizi[] = {14,19,5,21};

        int min = dizi[0];

        for (int i = 0; i <dizi.length ; i++) {

            if (dizi[i] < min){
                min = dizi[i];
            }
        }
        System.out.println(min);












    /*  Arrays.sort(dizi); // 5 14 19 21
        System.out.println(Arrays.toString(dizi));
        System.out.println("****************************");
        System.out.println("Min = " + dizi[0]);

     */











     /* int dizi[] = {14,19,5,21};
        Arrays.sort(dizi);
        System.out.println(dizi[0]);

      */
    }
}
