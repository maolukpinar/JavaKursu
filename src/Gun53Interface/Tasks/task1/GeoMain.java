package Gun53Interface.Tasks.task1;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen();
        System.out.println("DD Alanı :" +dd.alani(4,5));
        System.out.println("DD Çevresi :"+dd.cevresi(4,5));

        Cember cem = new Cember();
        System.out.println("Çember Alanı : "+cem.alani(5));
        System.out.println("Çember Çevresi : "+cem.cevresi(5));

        Kare kare = new Kare();
        System.out.println("Kare Alanı :"+kare.alani(4,4));
        System.out.println("Kare Çevresi : "+kare.cevresi(4,4));


    }
}
