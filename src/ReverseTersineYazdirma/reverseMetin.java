import java.util.Scanner;

public class reverseMetin {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir Metin Giriniz : ");
        String metin=oku.nextLine();
        String ters= "";

        for (int i=metin.length()-1; i>=0; i-- )
        {
            ters = ters + metin.charAt(i);
        }
        System.out.println("Girilen metnin tersi = " + ters);
    }
}
