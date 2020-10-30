package Replit;

public class Array3 {
    public static void main(String[] args) {

        /*İnt Array oluştur ve elemanları   : 25,30,30,35,100

Array in elemanlarının toplamını yazdır.

Cevap 220 olmalı.*/


        int[] dizi = new int[5];

        int[] e ={25,30,30,35,100};

        int toplam=0;
        for (int i=0; i<dizi.length; i++){

            toplam+=e[i];


        }
        System.out.println(toplam);


    }
}
