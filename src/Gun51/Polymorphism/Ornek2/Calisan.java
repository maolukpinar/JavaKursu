package Gun51.Polymorphism.Ornek2;

public class Calisan extends Kisi {
    private String departman;

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Calisan(String ad, String soyod, String gorev, String departman) {
        super(ad, soyod, gorev);
        this.departman = departman;


    }
}
