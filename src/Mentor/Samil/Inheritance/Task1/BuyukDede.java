package Mentor.Samil.Inheritance.Task1;

public class BuyukDede {
    String isim, soyisim, meslek;
    int yas;
    boolean tatlisever;

    public BuyukDede() {
    }

    public BuyukDede(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "BuyukDede{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", meslek='" + meslek + '\'' +
                ", yas=" + yas +
                ", tatlisever=" + tatlisever +
                '}';
    }
}
