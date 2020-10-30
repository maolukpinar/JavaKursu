package Bolum06_Arrays;

import java.util.Arrays;

public class Odev07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        int dizi[] = {12,2,5,15,8};

        int max = dizi[0];

        for (int i = 0; i <dizi.length ; i++) {

            if (dizi[i]>max){
                max = dizi[i];
            }
        }
        System.out.println(max);



    /*  int dizi[] = {12,2,5,15,8};
        Arrays.sort(dizi);
        System.out.println(dizi[dizi.length-1]);
     */





    }
}
