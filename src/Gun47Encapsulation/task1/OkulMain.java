package Gun47Encapsulation.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {


        Okul okul1=new Okul("Kabataş Lisesi",3);
        ArrayList<Ogrenci> okulunOgrenciler = okul1.getOgrenciler();

        int ogrenciSayisi=1;
        Scanner oku =new Scanner(System.in);
        do{
            System.out.print(ogrenciSayisi + ".Öğrencinin Adı = ");
            String ogrAd=oku.nextLine();

            System.out.print(ogrenciSayisi + ".Öğrencinin Soyadı = ");
            String ogrSoyad=oku.nextLine();

            System.out.print(ogrenciSayisi + ".Öğrencinin Yaşı = ");
            int yas=oku.nextInt();

            try {

                Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, yas);
                //okul1.getOgrenciler().add(ogr);
                okulunOgrenciler.add(ogr);
                ogrenciSayisi++;

            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }




        }while (ogrenciSayisi <= okul1.getMaxOgrenciSayisi());
        
        for(Ogrenci ogr : okul1.getOgrenciler())
        {
            System.out.println("ogr = " + ogr);
        }
    }
}
