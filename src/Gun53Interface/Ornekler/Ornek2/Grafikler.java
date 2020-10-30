package Gun53Interface.Ornekler.Ornek2;

public class Grafikler {
    public static void main(String[] args) {
    //bir interface den bir çok class implemente edilebilir
        Cember cember = new Cember();
        Dikdortgen dd = new Dikdortgen();

        cember.ciz();
        dd.ciz();


        //interfacelerden nesne üretilemez fakat referans tipi oluşturulabilir.
        //bu bize Polymorphism sağladı
        ICizilebilir cember2 = new Cember();
        cember2.ciz();
    }
}
