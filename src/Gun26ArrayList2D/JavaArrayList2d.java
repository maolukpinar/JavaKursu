package Gun26ArrayList2D;

import java.util.ArrayList;

public class JavaArrayList2d {
    public static void main(String[] args) {



        /***********************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] mat2 = new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<Integer> arrList = new ArrayList<Integer>(); // istenildiği kadar değişken eklenebilir
        /***********************/


        ArrayList<ArrayList<Integer>> notlarArrList = new ArrayList<>();


        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);

        notlarArrList.add(matNotlar);
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);

        //     for (int i =0; i<matNotlar.size(); i++)
        //   {
        //     System.out.println(matNotlar.get(i));
        // }
        System.out.println("notlarArrList.size = " + notlarArrList.size());
        for (int i = 0; i < notlarArrList.size(); i++) {


            //System.out.println(notlarArrList.get(i));


            for (int j = 0; j < notlarArrList.get(i).size(); j++) {
                System.out.println("i.yapraktaki j.not = " + notlarArrList.get(i).get(j));
            }

        }
        //TODO bana öyle bir metod yazınki,  metoda dersin nosunu  göndereceğim bana ortalamasını verecek.

        /*int matOrt = dersOrtalamaBul(0, notlarArrList);
        System.out.println("matOrt = " + matOrt);


        int turOrt = dersOrtalamaBul(1, notlarArrList);
        System.out.println("turOrt = " + turOrt);

        int kimOrt = dersOrtalamaBul(0, notlarArrList);
        System.out.println("kimOrt = " + kimOrt);


        public static int dersOrtalamaBul(int dersNo, ArrayList<ArrayList<Integer>>notlarArrList){
            int toplam=0;

            for (int i = 0; i <notlarArrList.get(dersNo).size() ; i++) {
                toplam=toplam+notlarArrList.get(dersNo).get(i);

            }
        return toplam/notlarArrList.get(dersNo).size();

        }
*/
        int matOrt = dersOrtalamaBul(0, notlarArrList);
        System.out.println("matOrt = " + matOrt);

        int turOrt = dersOrtalamaBul(1, notlarArrList);
        System.out.println("turOrt = " + turOrt);

        int kimOrt = dersOrtalamaBul(2, notlarArrList);
        System.out.println("kimOrt = " + kimOrt);
    }

    public static int dersOrtalamaBul(int dersNo, ArrayList<ArrayList<Integer>> notlarArrList){
        int toplam=0;

        for(int i=0; i<notlarArrList.get(dersNo).size(); i++)
        {
            toplam = toplam + notlarArrList.get(dersNo).get(i);
        }

        return toplam/notlarArrList.get(dersNo).size();


 //TODO Öyle bir metod yazın ki tüm derslerin ortalamasını bulsun.

      /*  int tumDersOrt=tumDersOrtBul(notlarArrList);
        System.out.println("tumDersOrt = " + tumDersOrt);

    }

    public static int dersOrtalamaBul(int dersNo, ArrayList<ArrayList<Integer>> notlarArrList){
        int toplam=0;

        for(int i=0; i<  notlarArrList.get(dersNo).size(); i++)  // ilgili dersin not sayısı
        {
            toplam = toplam + notlarArrList.get(dersNo).get(i);
        }

        return toplam/notlarArrList.get(dersNo).size();
    }


    public static int tumDersOrtBul(ArrayList<ArrayList<Integer>>  notlarArrList)
    {
        int toplam=0;
        int notMiktari=0;

        for(int i=0;i<notlarArrList.size();i++)
        {
            for (int j = 0; j <notlarArrList.get(i).size() ; j++) {
                toplam += notlarArrList.get(i).get(j);
                notMiktari++;
            }
        }

        return toplam/notMiktari;


*/
    }

}
