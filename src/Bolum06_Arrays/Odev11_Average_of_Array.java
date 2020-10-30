package Bolum06_Arrays;

public class Odev11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        int [] dizi = {12,14,21,23,10,4};

        int toplam = 0;

        for (int i = 0; i <dizi.length ; i++) {
            toplam += dizi[i];  // toplam = toplam + dizi[i]

        }
        int ort = toplam / dizi.length;
        System.out.println(ort);








    }
}
