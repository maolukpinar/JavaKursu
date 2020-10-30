import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {
    //todo Sadece aralarında boşluk varken işe yarıyor!
    /*
        Given String array

        reverse the String array

        print the reversed array

        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);
     */
    /*
          Verilen String array

         String arrayi ters çevir

         ters arrayi yazdır

       NOT:
       Arrays.toString(your_array_name);  <--- kullanın
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split("");

     //        code start here

     //        Koda burdan başlayın

        //todo 1.YÖNTEM:

        String[] tersArray=new String[useThisArray.length]; // useThisArray ile aynı boyutta tersArray oluşturuldu:

        int j = useThisArray.length-1; // useThisArray'in son son indexini aldık:

        for(int i=0; i<useThisArray.length; i++)    // for loop ile useThisArray'in elemanlarını geziyoruz:
                  // useThisArray ilk elemanı tersArray'in son elemanı olacak şekilde tersArray doldurulur.
                  // Her seferinde azaltılır: i=0,1,2,...9  şeklinde artarken j=9,8,7,...0 şeklinde azalır.
            tersArray[j--]=useThisArray[i];

        System.out.println("todo 1.YÖNTEM: : " +Arrays.toString(tersArray));   //Arrays.toString(tersArray) ile ekrana yazdırıyoruz.

        //todo 2.YÖNTEM:


        for(int i=useThisArray.length-1; i>=0; i--)     // useThisArray'in elemanları sondan başa doğrı gezilecek.
            tersArray[useThisArray.length-1-i]=useThisArray[i]; // useThisArray'in indexinden i kadar sırayla azaltıyorum.

        System.out.println("todo 2.YÖNTEM : " +Arrays.toString(tersArray));


        //todo 3.YÖNTEM:

        for(int i=0; i<useThisArray.length; i++)
            tersArray[i]=useThisArray[useThisArray.length-1-i];

        System.out.println("todo 3.YÖNTEM : " +Arrays.toString(tersArray));



        







    }

}









