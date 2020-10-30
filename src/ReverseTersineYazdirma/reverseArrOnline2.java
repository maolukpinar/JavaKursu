import java.util.Scanner;

public class reverseArrOnline2 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.print("Bir şey yazınız : ");
        String myStr=read.nextLine();


        String[] useThisArray=myStr.split("");

        //  *******  code start here   *******        Koda burdan başlayın

        //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<useThisArray.length;i++)
            System.out.print(useThisArray[i] + "  ");

        System.out.println();

        // print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=useThisArray.length-1;i>=0;i--)
            System.out.print(useThisArray[i] + "  ");
    }
}
