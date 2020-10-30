package Gun43.StringBuilderStringBuffer;

import java.util.Arrays;

public class _01_JavaStrings {
    public static void main(String[] args) {


        //TODO STRİNGLERİN FARKI  (STRİNG, STRİNGBUİLDER, STRİNGBUFFER)
        String cumle="";
        cumle += "Bugün";
        cumle += " hava"; // String değişkeni çok fazla ekleme veya işlemlere göre perfomansı oldukça düşük.

        // Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olanStringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.Fakat paralel çalışan uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

                    //TODO------------------------------------------------------------TODO//


        StringBuilder s = new StringBuilder("Bu");

        s.append("gün");//add gibi ekleme yapıyor
        s.append(" hava");
        s.append(" çok sıcak");

        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());
        s.append(4);

        s.reverse();//stringi tersine çeviriyor
        System.out.println("s = " + s);
        
        s.delete(0,5);//0 dahil 5 hariç 5 e kadar olan bölümü sildi
        System.out.println("s = " + s);
        
        s.deleteCharAt(3);//sadece 0 indeksten itibaren verilen index teki karakteri siler
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());//değişkenin içindeki karakter sayısı
        System.out.println("s.capacity() = " + s.capacity());//hafızadaki genişleyebilmesi için
        //verilmiş ön alan, ancak eklendikçe artan bir alan, tampon genişleyebilme alanı
        
        s.insert(5,"545");//5 nolu indexe insert yaptı
        System.out.println("s = " + s);
        
        s.insert(4,3.45);//double bile eklenebilir ama stringe çevirip ekleyecektir.
        System.out.println("s = " + s);
        
        int[] dizi = {2,3,4,5,506};
        
        s.insert(6, Arrays.toString(dizi));//dizi insert edildi.
        System.out.println("s = " + s);
        
        //burada içeriği yeniledik
        s=new StringBuilder("Bugünhavaçoksıcak");
        System.out.println("s = " + s);
        
        s.replace(3,8,"bu");//başlangıç ve son verilen bölüme stingi atar, eğer verilen
        //büyük ise aradaki bölüm delete olur, üst sınır hariç
        System.out.println("s = " + s);
        
        
        
        
        
    }
}
