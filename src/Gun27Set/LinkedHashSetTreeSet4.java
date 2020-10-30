package Gun27Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTreeSet4 {
    public static void main(String[] args) {
        
        //HashSet, LinkedHashSet, TreSet

        //Hash algoritmasına bağlı sıralamaya göre saklar
        HashSet<String > hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        //Ekleme sırasına göre
        LinkedHashSet<String > lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        //Alfabetik veya rakamsal sıraya göre her eklemede saklar
        TreeSet<String > ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

        //Alfabetik veya rakamsal sıraya göre her eklemede saklar
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(1);
        ts2.add(5);
        ts2.add(19);
        ts2.add(100);
        ts2.add(9876);
        System.out.println("ts2 = " + ts2);

    }

}
