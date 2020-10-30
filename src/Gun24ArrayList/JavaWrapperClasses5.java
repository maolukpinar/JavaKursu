package Gun24ArrayList;

public class JavaWrapperClasses5 {
    public static void main(String[] args) {

        //programda sadece rakam veya harf gibi veya true false gibi basit değerler saklayacaksa
        //hafızada çok yer kaplamasın diye aynı tiplerin basit yani primitive tiplerini oluşturalım.
        //eğer bu değerlerden fazlası gerekecekse o zaman bunların ilk harfi büyük olan tipleri kullanılır.


        int a = 5;
        String strInt = String.valueOf(a);//bu sadece basit bir sayı

        Integer b=6;
        String strInteger =b.toString();//yani bu tipin içinde gerekli çokça metod var.
        //içinde çokça metod olan tiplere Wrapper Class deniyor.
        //Wrapper kaplamak demek.

        b = a; //boxing denir, basit olan tipin kapsamlı tipe atanmasına denir
        a = b;//unboxing denir, yani kapsamlı tipin, basite atanmasına denir


        double c=3.4;
        Double d=5.6;

        char e ='F';
        Character f ='Y';

        boolean g =true;
        Boolean h =false;

        float k=3.4f;
        Float l=5.6f;




    }
}
