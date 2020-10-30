package Bolum06_Arrays;

import java.util.Arrays;

public class Odev01_Create_array {

    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String[] meyve = {"Apple","Orange" ,"Banana","Kiwi"};
        for (int i = 0; i <meyve.length ; i++) {
            System.out.println(meyve[i]);
        }



        //System.out.println(Arrays.toString(meyve));



    }
}
