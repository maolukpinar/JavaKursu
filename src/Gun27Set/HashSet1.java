package Gun27Set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        
        //Array-->>ArrayList-->>Set
        //Collections : Koleksiyonlar
        //HashSet : Kendine göre bir algoritma ile sıralayarak saklıyor. Gezinme hızı
        //LinkedHashSet : Kullanıcının ekleme sırasına göre saklıyor
        //TreeSet : her veri girildiğinde tüm verileri küçükten büyüğe olacak şekilde sıralayarak saklıyor.
        //Avantajı : aynı elemanı 2 kez eklemiyor.(ArrayListen bir farkı da bu)


        //add : Set icersinde bir eleman ekler
        // clear : Set icerisndeki butun elemanlari siler.
        // contains : Bir eleman dizi icinde mi kontrl eder.
        // remove : bir eleman siler
        // size : o ana kadar kac eleman ekledigini dondurur.
        // isEmpty : bos olup olmadigini kontrol eder.
        // containsAll : bellirli bir eleman , set icerisinde var mi yok mu bakiyor
        // addAll : coklu islemler toplu ekleme baska bir kumeyi kumeye ekleme
        // retainAll : iki kumenin kesisimini bulur
        // removeAll : hepsini siler
        // toArray : seti dizi haline getiriyor, dizi formatina cevirme





        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("list = " + list);
        
        
        HashSet<Integer> hs =new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        boolean eklediMi=hs.add(2);

        System.out.println("eklediMi = " + eklediMi);
        
        System.out.println("hs = " + hs);
        
        
        
        
    }
}
