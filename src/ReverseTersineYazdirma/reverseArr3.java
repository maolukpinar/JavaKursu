import java.util.Arrays;
import java.util.Scanner;

public class reverseArr3 {

     /*
          Verilen String array

         String arrayi ters çevir

         ters arrayi yazdır

       NOT:
       Arrays.toString(your_array_name);  <--- kullanın
     */

    //todo 2.YÖNTEM:

     public static void main(String[] args) {

         Scanner scan =new Scanner(System.in);

         String myStr = scan.nextLine();

         String[] useThisArray = myStr.split("");

         String[] tersArray=new String[useThisArray.length]; // useThisArray ile aynı boyutta tersArray oluşturuldu:

         int j = useThisArray.length-1; // useThisArray'in son son indexini aldık:

         for(int i=useThisArray.length-1; i>=0; i--)     // useThisArray'in elemanları sondan başa doğrı gezilecek.
             tersArray[useThisArray.length-1-i]=useThisArray[i]; // useThisArray'in indexinden i kadar sırayla azaltıyorum.

         System.out.println("todo 2.YÖNTEM : " +Arrays.toString(tersArray));







     }
}
