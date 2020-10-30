package Gun24ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {

        //Arraylist Collction grubunun bir elemanı
        //Array i sıralarken


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println("Sıralı Değil = " + numbers);
        //Sıralama yapar
        Collections.sort(numbers);
        System.out.println("Sıralı = " + numbers);

        //en büyük değeri bulur
        int max= Collections.max(numbers);
        //en küçük değeri bulur
        int min = Collections.min(numbers);

        //Listeyi tersine çevirir
        Collections.reverse(numbers);
        System.out.println("Ters = " + numbers);

        //bir değere göre doldurma
        Collections.fill(numbers, 101);
        System.out.println("fill den sonra = " + numbers);

        //belli bir değere sahip elemanları yenisi ile değiştirir
        Collections.replaceAll(numbers, 101 , 5 );
        System.out.println("replaceAll den sonra = " + numbers);




    }
}
