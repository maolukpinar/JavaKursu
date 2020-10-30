package Gun55Abstract.Ornekler.Ornek2;

public class GeometrMain {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen("Dikdörtgen",4,5);
        dd.setName("Yeni Dikdörtgen");
        System.out.println(dd);

        Cember cm = new Cember(6);
        cm.setName("Yeni Çember");
        System.out.println(cm);
        System.out.println(cm.toString2());
    }
}
