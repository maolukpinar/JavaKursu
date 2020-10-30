package Mentor.Samil.Inheritance.Task1;

public class Baba extends Dede {
    boolean araba;



    public Baba(String isim) {
        super(isim);
    }

    @Override
    public String toString() {
        return "Baba{" +
                "araba=" + araba +
                ", boy=" + boy +
                ", torun=" + torun +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", meslek='" + meslek + '\'' +
                ", yas=" + yas +
                ", tatlisever=" + tatlisever +
                '}';
    }
}
