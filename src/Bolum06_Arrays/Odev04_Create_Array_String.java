package Bolum06_Arrays;

public class Odev04_Create_Array_String {

    public static void main(String[] args) {

        /*
        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */

        // Kodu aşağıya yazınız..

        String str[] = {"new jersey" , "new york", "boston","California"};

        int sayac =0;

        for (int i = 0; i <str.length ; i++) {
            sayac++;
        }
        System.out.println(sayac);




    }
}
