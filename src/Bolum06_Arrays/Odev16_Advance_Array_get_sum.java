package Bolum06_Arrays;

import java.util.Arrays;

public class Odev16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String str = "$12 $23 $10 $2 $5 $2";

    //  String str2 = str.replaceAll("\\D","");
        String str2 = str.replaceAll("[$]","");

        String [] dizi = str2.split(" ");  // "12 23 10 2 5 2"; String
        
        // int[]a = new[6]          6
        int[] diziyeni = new int[dizi.length];

        for (int i = 0; i <dizi.length ; i++) { // 12 23 10 2 5 2 int
            diziyeni[i] =Integer.parseInt(dizi[i]);            
        }

        // int[] yenidizi = {12 23 10 2 5 2}
        int top = 0;

        for (int i = 0; i <diziyeni.length ; i++) {
            top += diziyeni[i];
        }
        System.out.println(top);
        
        























        /*

        String str = "$12 $23 $10 $2 $5 $2";

        String str2 = str.replaceAll("[^0-9,' ']","");

        String[] strnum =  str2.split(" ");

        int[] str_int = new int[strnum.length];

        for (int i = 0; i <str_int.length ; i++) {
            str_int[i] = Integer.parseInt(strnum[i]);
        }

        int top =0;

        for (int i = 0; i <str_int.length ; i++) {
            top += str_int[i];

        }
        System.out.println(top);

         */






    }
}
