package Mentor.Tahir;

import java.util.Arrays;

public class ArraySoru2Tahir {
    public static void main(String[] args) {

        /* TODO Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu alin.

        [C, o, n, g, u, r, a, t, u, l, a, t, i, o, n, s]
        [s, n, o, i, t, a, l, u, t, a, r, u, g, n, o, C]
        snoitalutarugnoC
        Cingritilitiins  // o ,a ve u harfini i ye donuster

         */

        String str ="Congratulations";
        String[]arr=str.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------");

        int counter =0;
        String[] yeniArr = new String[arr.length];
        for (int i=arr.length-1; i >=0 ; i--){
            yeniArr[counter++]=arr[i];

        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
