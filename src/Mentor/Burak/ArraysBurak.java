package Mentor.Burak;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBurak {
    public static void main(String[] args) {

       //TODO --------ARRAYLER  - DİZİLER ------------
        System.out.println("----------TODO --------ARRAYLER  - DİZİLER ------------");
        //Temel Yöntem

       int [] intArray = new int[3];

       intArray[0] = 40;
       intArray[1] = 50;
       intArray[2] = 60;

        //Daha düzenli ve basit yöntem

        int[] intArray1 = {10,20,30};
                         //0   1  2

        //Spesifik eleman gösterme
        System.out.println("1.Array'in 3. elemanı : " +intArray[2]);
        System.out.println("2.Array'in 2. elemanı : " +intArray[1]);


        //TODO ARAY ELEMANLARINI STRİNG OLARAK YAZDIRMA
        System.out.println("------------TODO ARAY ELEMANLARINI STRİNG OLARAK YAZDIRMA-----------");
            String [] isimler = {"Ayşe", "Fatma", "Hayriye"};

            int[] yaslar = {18, 19, 20};

        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.toString(yaslar));

        //TODO CHAR ARRAY YAZDIRMA
        System.out.println("-----------TODO CHAR ARRAY YAZDIRMA-----------");
        //Char Array oluştur. Arrayin içindeki karakterler yan yana yazıldığında "Selam" yazsın.
        //for loop kullanarak Array'in içindeki karakterleri yazdır
        char[] harfler ={'S', 'e', 'l', 'a', 'm'};

        for (int i =0; i < harfler.length; i++){
            System.out.print(harfler[i]);
        }

        //TODO SCANNER İLE ARRAY ELEMANLARINI GİRME
        System.out.println("-----------TODO SCANNER İLE ARRAY ELEMANLARINI GİRME--------");
        Scanner sc = new Scanner(System.in);

        int [] Elma = new int[4];
        System.out.println("Array elemanlarını giriniz: ");
        for (int j =0; j < Elma.length; j++){
            Elma[j] = sc.nextInt();

        }
        System.out.println("Array'in değerleri yazdırılıyor: ");
        for (int j =0; j < Elma.length; j++){
            System.out.println("Eleman: "+Elma[j]);
        }







    }
}
