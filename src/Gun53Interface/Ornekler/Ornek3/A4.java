package Gun53Interface.Ornekler.Ornek3;

// birden fazla interface den implemente edilebilir
public class A4 implements IYazdirilabilir,IGosterilebilir{
    @Override
    public void goster() {
        System.out.println("gösterildi...");
    }

    @Override
    public void yaz() {
        System.out.println("yazdırıldı...");
    }
}
