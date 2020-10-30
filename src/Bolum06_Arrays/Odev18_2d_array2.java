package Bolum06_Arrays;

public class Odev18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.

        int [][] matrix = {{5,2,1,0} , {10,2,3,6} , {1,2,0,0}};

        int top = 0;

        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix[i].length ; j++) {

                top += matrix[i][j];

            }

        }
        System.out.println(top);




    }
}
