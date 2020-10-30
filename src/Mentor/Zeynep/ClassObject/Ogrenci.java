package Mentor.Zeynep.ClassObject;
//isim, bolum, yas, birinciSinav, ikinciSinav ve ucuncuSinav instance variable
// (degiskenlerini) iceren bir Ogrenci class i olusturunuz
//ogrencinin not ortalamasini hesaplayacak bir method olusturunuz.

public class Ogrenci {

    String isim;
    String bolum;
    int yas;
    int birinciSinav;
    int ikinciSinav;
    int ucuncuSinav;

    int notOrtalamasi(){

        return (birinciSinav+ikinciSinav+ucuncuSinav)/3;
}


    }

