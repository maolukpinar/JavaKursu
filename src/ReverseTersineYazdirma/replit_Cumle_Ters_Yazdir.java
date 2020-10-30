package ReverseTersineYazdirma;

import java.util.Scanner;

public class replit_Cumle_Ters_Yazdir {
    public static void main(String[] args) {



    }

    public void reverseString()

    {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String metin=oku.nextLine();
        String ters="";

        for(int i=metin.length()-1; i>0; i--)
        {
            ters = ters + metin.charAt(i);
        }
        System.out.print(ters);


    }
}
