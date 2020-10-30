package Bolum06_Arrays;

public class Odev06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String dizi[] ={ "Orange" , "Banana" ,"Apple", "Pineapple"};

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i].contains("Apple"))
                System.out.println(true);
        }

    }
}
