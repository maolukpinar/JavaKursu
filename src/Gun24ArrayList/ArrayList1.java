package Gun24ArrayList;

//Array, 2D Array, Arraylist, Gelecek hafta ArrayList Colleciton, Colleciton diğer Array
//Sonraki hafta Class,


import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {


        //Array    : Boyut sayının belli olduğu ve elemanlarının çok sık değişmediği durumlarda kullandık


        int [] dizi = new int[5];//Boyutu daha sonra değiştirilemiyor

        //ArrayList :Boyutu dinamik yani değişken ve değerlerin hızlı değişmesi durumunda daha hızlı

        ArrayList<Integer> integerliste = new ArrayList<Integer>();
        ArrayList<Boolean> booleanliste = new ArrayList<Boolean>();
        ArrayList<String > stringliste = new ArrayList<>();

        //String ArrayList tanımlaması
        ArrayList<String> isimler=new ArrayList<>();

        //Eleman ekleme
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");
        System.out.println("1 - isimler = " + isimler);


        //belli bir indexe eleman ekleme, eklendiği indexten sonrakiler bir aşağı kayar
        isimler.add(1, "Zeynep");
        System.out.println("2 - isimler = " + isimler);

        //2 nolu indexteki elemanı verir.
        String elemanArIndex2= isimler.get(2);
        System.out.println("elemanArIndex2 = " + elemanArIndex2);

        //0 indexteki elemanın değerini değiştir
        isimler.set(0,"Deniz");
        System.out.println("3 - isimler = " + isimler);

        //Eleman sayısını verir, Array deki length
        int elemansayisi = isimler.size();
        System.out.println("elemansayisi = " + elemansayisi);

        //Listenin tamamen boş olup olmadığınız verir
        boolean ListeBosmu = isimler.isEmpty();
        System.out.println("ListeBosmu = " + ListeBosmu);

        //Eleman Silme
        isimler.remove("Ayşe");
        System.out.println("4 - isimler = " + isimler);
        isimler.remove(1);
        System.out.println("5 - isimler = " + isimler);

        //Bir elemanın indexini bulma
        int indexofkaya = isimler.indexOf("Kaya");
        System.out.println("indexofkaya = " + indexofkaya);

        //Tüm elemanları boşaltma
        isimler.clear();
        System.out.println("6 - isimler = " + isimler);

    }
}
