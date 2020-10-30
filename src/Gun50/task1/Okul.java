package Gun50.task1;

import java.util.ArrayList;

public class Okul {
    private String isim;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
    private ArrayList<Calisan> calisanlar = new ArrayList<>();

    public Okul(String isim, int maxOgrenciSayisi) {
        setIsim(isim);
        setMaxOgrenciSayisi(maxOgrenciSayisi);

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public ArrayList<Calisan> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(ArrayList<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }

    public void ogrenciKayit(Ogrenci ogr){
        ogrenciler.add(ogr);
    }

    public void CalisanKayit(Calisan cal){
        calisanlar.add(cal);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciler=" + ogrenciler +
                ", calisanlar=" + calisanlar +
                '}';
    }

    public void OgrenciListele()
    {
        for (Ogrenci ogr:ogrenciler)
        {
            System.out.println(ogr);
        }
    }

    public void CalisanListele()
    {
        for (Calisan cal:calisanlar)
        {
            System.out.println(cal);
        }
    }



}
