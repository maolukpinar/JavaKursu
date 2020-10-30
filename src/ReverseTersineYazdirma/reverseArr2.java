import java.util.Arrays;
import java.util.Scanner;

public class reverseArr2 {
    //todo Sadece aralarında boşluk varken işe yarıyor!
     /*
          Verilen String array

         String arrayi ters çevir

         ters arrayi yazdır

       NOT:
       Arrays.toString(your_array_name);  <--- kullanın
     */
     public static void main(String[] args) {

         Scanner scan =new Scanner(System.in);

         String myStr = scan.nextLine();

         String[] useThisArray = myStr.split("");

         //  *******  code start here   *******        Koda burdan başlayın

         //todo 1.YÖNTEM:

         String[] tersArray=new String[useThisArray.length];  // useThisArray ile aynı boyutta tersArray oluşturuldu:

         int j=useThisArray.length-1;    // useThisArray'in son son indexini aldık:

         for(int i=0; i<useThisArray.length; i++)   // for loop ile useThisArray'in elemanlarını geziyoruz:
                 // useThisArray ilk elemanı tersArray'in son elemanı olacak şekilde tersArray doldurulur.
                 // Her seferinde azaltılır: i=0,1,2,...9  şeklinde artarken j=9,8,7,...0 şeklinde azalır.
             tersArray[j--]=useThisArray[i];

         System.out.println(Arrays.toString(tersArray));   //Arrays.toString(tersArray) ile ekrana yazdırıyoruz.







     }
}
