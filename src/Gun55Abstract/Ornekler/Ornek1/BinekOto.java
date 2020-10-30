package Gun55Abstract.Ornekler.Ornek1;
// abstract anahtar kelimesi ile abstract class oluşturmuş oluyoruz.
public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    public abstract String getMarka();
    // implemente edilmek zorunda


    // ister override yapılabilir,
    // istenirse yapılmayabilir.
    public int getUretimYili()
    {
        return this.uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }
}
