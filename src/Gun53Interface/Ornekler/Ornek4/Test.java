package Gun53Interface.Ornekler.Ornek4;

public class Test implements IGoster, IYazdir{
    @Override
    public void goster() {
        System.out.println("göster");
    }

    @Override
    public void yaz() {
        System.out.println("göster yaz");
    }
}
