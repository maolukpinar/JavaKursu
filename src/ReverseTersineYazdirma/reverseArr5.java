import java.util.Arrays;
import java.util.Scanner;

public class reverseArr5 {
    public static void main(String[] args) {
        //todo 4.YÖNTEM:

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split("");

        //  code start here     Koda burdan başlayın



        String[] tersArray=new String[useThisArray.length];      // useThisArray ile aynı boyutta tersArray oluşturuldu:

        int j = useThisArray.length-1;                           // useThisArray'in son son indexini aldık ve j'ye atadık.

        for( String str : useThisArray)                          // usethisArray'in tüm elemanlarını geziyoruz.

            tersArray[j--] = str;                                // İlk elemanı j'ye atıyoruz ve bu son eleman oluyor, geriye doğru gidiyor.

        System.out.println("todo 4.YÖNTEM : " + Arrays.toString(tersArray));
    }
}
