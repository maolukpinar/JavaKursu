package Bolum06_Arrays;

import java.util.Arrays;

public class Odev17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.

        int [][] matrix = {{2,3,2} , {4,1,5} , {7,2,5}};

        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix[i].length ; j++) {

                if (matrix[i][j] == 2){
                    matrix[i][j] = 6;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }








    }
}
