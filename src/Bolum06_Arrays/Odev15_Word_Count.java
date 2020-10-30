package Bolum06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Odev15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String str = "Removes white space from both ends of a string"; //

        String[] dizi = str.split(" "); // {Removes,white,space,from,both,ends,of,a,string}

        int sayac=0;
        for (int i=0; i<dizi.length;i++){
            sayac++; //1 2 3 4 5 6 7 8 9
        }
        System.out.println(sayac);





    /*  Harf sayısı
        int sayac =0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)== ' ')
                continue;
            sayac++;

        }
        System.out.println(sayac);

     */






    }
}
