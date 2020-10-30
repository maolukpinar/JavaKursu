import java.util.Scanner;

public class reverseMetin3 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Bir şey yazınız : ");
        String str=read.nextLine();
        String reverse="";

        for(int i=str.length()-1; i>=0; i--)
        {
            reverse+=str.charAt(i);
        }
        System.out.println("Girilen verinin tersi = " + reverse);


    }
}
