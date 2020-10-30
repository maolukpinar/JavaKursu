package Gun33StaticAndNonStatic.Example;

public class JavaStaticAndNonStaticMethods {

    public static void main(String[] args) {
        //Benim bütün programlarıda kullanacağım tip dönüşümleri için metodlara ihtiyaç var.
        //mesal int to string, string to int, vs vs.. bunları yapan bir sınıf yazınız.
        //ve bunları main de kullanarak gösteriniz

        // 1.Yöntem tip dönüşümü için javanın direk komutları
        int sayi=345;
        String strRakam= String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

        // 2.Yöntem tip dönüşümü için kendi sınıfımı yazdım onu kullanacağım
//        Utility util=new Utility();
//        strRakam = util.getString(sayi);
//        intRakam = util.getInt(strRakam);

            //3.Yöntem
        // yeniden oluşturmadığımız sınıfın direk adı ile kullanıyoruz.
        strRakam = Utility.getString(sayi);
        intRakam = Utility.getInt(strRakam);

        //Aynı Math sınıfı gibi
        Math.random();

    }
}
