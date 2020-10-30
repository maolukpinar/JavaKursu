import java.util.Scanner;

public class reverseMetin2 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Bir Metin ya da Rakam Giriniz : ");
        String txt=read.nextLine();
        String reverse="";

        for(int i=txt.length()-1; i>=0; i--)
        {
            reverse+=txt.charAt(i);
        }
        System.out.println("Girilen metnin tersi : " + reverse);

    }

}
