package Mentor;

import java.util.Scanner;

public class Asalsayi {
    public static void main(String[] args) {

        //Kullanıcıdan aldığımız bir sayının asal olup olmadığını kontrol edin
        //Girdiğimiz sayıya kadar bütün asal sayıları yazdıralım

        Scanner oku = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = oku.nextInt();


        int counter =2;
        boolean isPrime=true;

        while (counter <number){
            if (number%counter==0){
                isPrime=false;
                break;
            }
            counter++;

        }

            if (isPrime==true){
                System.out.println("Asal");
            }else {
                System.out.println("Asal değil");
            }



    }
}
