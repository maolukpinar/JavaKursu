import java.util.Arrays;
import java.util.Scanner;

public class reverseArr4 {
    public static void main(String[] args) {

        //todo 3.YÖNTEM:

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split("");

        //  code start here     Koda burdan başlayın



        String[] tersArray=new String[useThisArray.length];      // useThisArray ile aynı boyutta tersArray oluşturuldu:

        int j = useThisArray.length-1;                           // useThisArray'in son son indexini aldık ve j'ye atadık.

        for(int i=0; i<useThisArray.length; i++)
            tersArray[i]=useThisArray[useThisArray.length-1-i];

        System.out.println("todo 3.YÖNTEM : " +Arrays.toString(tersArray));
    }
}
