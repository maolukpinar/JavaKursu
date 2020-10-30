package Mentor.Tahir.Junit;

public class Main {
    /*
    - Kodların kücük parcalarini test eder(method v fonksiyonlar, siniflar)
    - Kodun anlaşılması kolaylaşır
    - hata oranı azalır, kod kalitesi artar
    - daha güvenli kodlar
    - junit kütüphanesi


     */


//Stringin son karakterini veren method yazıyoruz

    public char lastCharcter(String str) {
        return str.charAt(str.length() - 1);
    }


    //Arrayin max elemanını bulma methodu yazalim ve test edelim

    public int maxNumberArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
//Faktöriyel bulma methodu yazalım ve test edelim...

    public int factorial(int num) {

        int faktoriyel = 1;

        while (num > 0) {
            faktoriyel = faktoriyel * num;
            num--;
        }
        return faktoriyel;

    }
}