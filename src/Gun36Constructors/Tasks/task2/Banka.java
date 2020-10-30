package Gun36Constructors.Tasks.task2;

public class Banka {

    String ad;
    int subeSayisi;
    int kurulus;

    public Banka(String ad, int subeSayisi, int kurulus) {
        this.ad = ad;
        this.subeSayisi = subeSayisi;
        this.kurulus = kurulus;
    }

    public Banka(String ad, int subeSayisi) {
        this(ad, subeSayisi, 0);
    }

    public Banka(String ad) {
        this(ad, 0, 0);
    }

    @Override
    public String toString() {
        return "Banka{" +
                "ad='" + ad + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulus=" + kurulus +
                '}';
    }

}
