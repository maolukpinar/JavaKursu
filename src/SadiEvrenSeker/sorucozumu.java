package SadiEvrenSeker;

import java.util.Scanner;

public class sorucozumu {
    public static void main(String[] args) {


        System.out.print("Lütfen notunuzu giriniz : ");
        Scanner oku = new Scanner(System.in);
        int not = oku.nextInt();

        if (not>=90 ){
            System.out.println("Notunuz = AA");
        }

        else if (not>=80){
            System.out.println("Notunuz = BB");
        }
        else if(not>=70){
            System.out.println("Notunuz = CC");
        }
        else {
            System.out.println("Notunuz = FF");
        }





    }
}
