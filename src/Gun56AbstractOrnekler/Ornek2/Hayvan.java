package Gun56AbstractOrnekler.Ornek2;


import java.time.LocalDate;

public abstract class Hayvan {

    static int sayac =0;


    private String isim;
    private boolean vahsi;
    private LocalDate dogumTarihi;
    private int id;


    abstract void yiyecegi();
    abstract void yemeMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    Hayvan()
    {
        sayac++;
        setId();
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int getId() {
        return sayac;
    }

    public void setId() {
        this.id = Hayvan.sayac;
    }


    @Override
    public String toString() {
        return "Hayvan{" +
                "id='" + id + '\'' +
                "isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
