package Gun27Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {


    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red"); // Bunu tekrar olduğu eklemedi.
        hs.add("red");
        hs.add("rED");

        // 1.Yol
        System.out.println("hs = " + hs);

        // 2.Yol
        for (String s : hs) {
            System.out.println("s = " + s);
        }

        //3.Yol
        Iterator gosterge = hs.iterator();
        while (gosterge.hasNext()) // sonraki varsa
        {
            System.out.println("Sonraki eleman = " + gosterge.next());

            hs.remove("Red"); // bir eleman siler
            hs.clear(); // set i temizler

        }
    }
}