package Gun55Abstract.Ornekler.Ornek1;
//abstract metod olduğundan zorunlu olarak
// yazılmak zorunda (imlemente edildi.)
public class ford extends BinekOto{
    @Override
    public String getMarka() {
        return "Ford focus";
    }

    //abstract class daki yazılmış somut metodları
    // ister olduğu gibi kullanabiliriz.
    // istenirse override yapabiliriz.
    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }
}
