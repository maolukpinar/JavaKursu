package Mentor.Samil.Inheritance.Task1;

public class Dede extends BuyukDede {

    int boy, torun;
    boolean baston;



    public Dede(String isim) {
        super(isim);
    }

    @Override
    public String toString() {
        return "Dede{" +
                "boy=" + boy +
                ", torun=" + torun +
                ", baston=" + baston +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", meslek='" + meslek + '\'' +
                ", yas=" + yas +
                '}';
    }
}
