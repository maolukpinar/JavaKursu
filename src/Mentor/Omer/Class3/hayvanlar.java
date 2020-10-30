package Mentor.Omer.Class3;

import java.util.Scanner;

public class hayvanlar {

    String hayvan;
    int yasi;
    String renk;



    public void tercihler(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Hangi hayvanı istiyorsunuz? ");
        hayvan=sc.nextLine();

        if(hayvan.equalsIgnoreCase("kedi")){

            yasi=4;
            renk="beyaz";
            System.out.println("Hangi hayvan"+ hayvan.toLowerCase()+"yaş; "+yasi+"Rengi : "+renk);
        }
        else if(hayvan.equalsIgnoreCase("köpek")){
            yasi=3;
            renk ="siyah";
            System.out.println("Hangi hayvan"+ hayvan.toLowerCase()+"\n yaş; "+yasi+"\n Rengi : "+renk);


          }
        else {
            System.out.println("Barınağımızda böyle bir hayvan yoktur..");
        }
    }
}
