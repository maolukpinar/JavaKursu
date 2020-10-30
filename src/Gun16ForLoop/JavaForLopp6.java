package Gun16ForLoop;

import java.util.Scanner;

public class JavaForLopp6 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle= oku.nextLine();
        
        int aMiktar=0;
        for (int i =0; i< cumle.length(); i++)
        {
            if (cumle.charAt(i) =='a')
                aMiktar++;
            else 
                if (cumle.charAt(i) == 'c')
                    break;
            System.out.println("cumle.charAt(i) = " + cumle.charAt(i));
        }
        System.out.println("aMiktar = " + aMiktar);
        
        
        
    }
}
