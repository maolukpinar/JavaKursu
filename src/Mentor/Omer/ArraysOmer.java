package Mentor.Omer;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class ArraysOmer {
    public static void main(String[] args) {

/*

todo Soru 1

 int array oluşturun.
 Sistem size "Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (!!Tek sayı olmalı !! :  )  " şeklinde bir soru sorsun.

 Array'in kaç elemandan oluşacagına kullanıcı karar versin. (3,5,7)

 ve bu elemanları kullanıcıdan alın. (Scanner)     (1. sayıyı giriniz  ... .... )

 Array'in içindeki elemanları küçükten büyüğe sıralayın .(method kullanın)

  ve            'ortadaki'              elemanı bulması için bir program yazın. (Her ihtimali düşünmeniz gerekiyor. sadece 3 elemanlı bir array için değil, 33 elemanlı bir array için de çalışmalı).

  örn:  5 elemanlı bir array

 [ 3,2,6,12,1}
 ortanca sayı = 6

 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (!!Tek sayı olmalı !! :  )  ");
        int sayi=sc.nextInt();
        int [] array=new int[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.println("elemanları gir: ");
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[(array.length-1)/2]);










    }
}
