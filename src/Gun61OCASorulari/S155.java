package Gun61OCASorulari;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);

        points.add(null);

        points.remove(1);//kim silinir, 1 değerli eleman mı 1 indexli eleman mı? Cevap ; indexli
        points.remove(null);//remove metodu hem indexe hem de objeye göre siler fakat önce

        
        System.out.println(points);
    }
}
