package Bolum06_Arrays;

import java.util.Arrays;

public class Odev19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

    String[][] matrix = {{"new jersey","atlanta","ohio"} ,{"Pittsburgh" ,"ohio","new york","ohio"} ,{"ohio","new york"}};

        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix[i].length ; j++) {

                if (matrix[i][j] == "ohio" )
                    matrix[i][j] = "Florida";

                System.out.println(matrix[i][j]);
            }
            System.out.println();

            }





    }
}
