package Gun49Inheritance.task4;

public class Ogrenci {
    int id;
    String isim;
    String tipi;

    public static int sayacID = 1;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }

    public Ogrenci(int id, String isim, String tipi) {
        this.id = id;
        this.isim = isim;
        this.tipi = tipi;


    }
}
