package Bolum06_Arrays;

public class Odev05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.

        int dizi[] = {5,6,8,12,14,19};

        int top =0;

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i] % 2 == 0)
                top+=dizi[i]; // cift = cift + dizi[i] --> dizi[1] + dizi[2] + dizi[3] + dizi[4]
            else
                top-=dizi[i]; // tek = tek + dizi[i]-->  dizi[0] + dizi[5]

        }
        System.out.println(top);

    }
}
