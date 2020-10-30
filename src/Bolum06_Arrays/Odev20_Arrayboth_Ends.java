package Bolum06_Arrays;

import java.util.Arrays;

public class Odev20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..

        int[]dizi1 =   {1, 2, 3, 4};

        int[] dizi2 = new int[2];

        dizi2[dizi2.length-1] = dizi1[dizi1.length-1];
        dizi2[0] = dizi1[0];

        System.out.println(Arrays.toString(dizi2));
    }
}
