package Gun28Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set3 {
    public static void main(String[] args) {

        Set<String> hs=new HashSet<>();
        hs.add("Ali");
        hs.add("Mehmet");
        hs.add("Ayşe");
        hs.add("Dilek");
        hs.add("Emir");

        System.out.println("hs = " + hs);//en hızlı tarama yapacak şekilde yerleştirdi

        Set<String> lhs=new LinkedHashSet<>();
        lhs.add("Ali");
        lhs.add("Mehmet");
        lhs.add("Ayşe");
        lhs.add("Dilek");
        lhs.add("Emir");

        System.out.println("lhs = " + lhs);//eklenme sırasına göre yerleştirdi

        Set<String> ts=new TreeSet<>();
        ts.add("Ali");
        ts.add("Mehmet");
        ts.add("Ayşe");
        ts.add("Dilek");
        ts.add("Emir");

        System.out.println("ts = " + ts);//küçükten büyüğe sıraladı


    }
}
