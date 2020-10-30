package Gun26ArrayList2D;

import java.util.ArrayList;

public class soru {
    public static void main(String[] args) {

        /***********************/
        int sayi=5; // tek bir rakam saklayabilen değişken
        int[] dizi=new int[5]; // 5 adet rakam saklayabilen değişken.
        int[][] mat2=new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<Integer> arrList=new ArrayList<Integer>(); // istenildiği kadar değişken eklenebilir
        /***********************/


        int[][] mat=new int[5][5]; // 5x5 => 25 adet rakam
        ArrayList<  ArrayList<Integer>  >  notlarArrList = new ArrayList<>();
        // boşluklar gereksi sade gözükebilsin diye yapıldı.

        ArrayList<Integer> matNotlar=new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar=new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar=new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);

        notlarArrList.add(matNotlar); // burada tanımalamada neyin listesi ise ona uygun değişkeni Ekledik
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);


//        for(int i=0;i<matNotlar.size(); i++)
//        {
//            System.out.println("matNotlar = " + matNotlar.get(i));
//        }

        //get i nin j si   =>    i bana defterdeki yaprak   j de yapraktaki not verir
        System.out.println("notlarArrList.size() = " + notlarArrList.size());
        for(int i=0;i<notlarArrList.size();i++) // notlarArrList.size():defterdeki derslerin not listesinin kaç tane olduğunu, yaprak sayısı
        {
            //System.out.println("notlarArrList = " + notlarArrList.get(i));
            for (int j = 0; j <notlarArrList.get(i).size() ; j++) {  // notlarArrList.get(i).size():1 yaprakdaki not sayısı
                System.out.println("i.yaprakdaki j.not= " + notlarArrList.get(i).get(j));
            }
        }

        //TODO bana öyle bir metod yazınki,  metoda dersin nosunu  göndereceğim bana ortalamasını verecek.

        int matOrt = dersOrtalamaBul(0, notlarArrList);
        System.out.println("matOrt = " + matOrt);

        int turOrt = dersOrtalamaBul(1, notlarArrList);
        System.out.println("turOrt = " + turOrt);

        int kimOrt = dersOrtalamaBul(2, notlarArrList);
        System.out.println("kimOrt = " + kimOrt);


        //TODO Öyle bir metod yazınki tüm derslerin ortolamasını bulsun.

        //int tumDersOrt=tumDersOrtBul(....);
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
    }

    }


