package SadiEvrenSeker;

public class Donguler {
    public static void main(String[] args) {


        //Todo 100 den 1 e kadar olan tek sayılar.

        for ( int i =99; i>=1; i-=2){
            System.out.println("Tek Sayılar : "+i);
        }
        System.out.println("_______________2.Soru_____________________");
        System.out.println();
        //Todo 0 ile 100 arasında hem 3'e hem de 7'ye bölünebilen
        for(int j =0; j<100; j++){

            if(j%3==0 && j%7==0) {
                System.out.println(""+j);
            }
        }

        System.out.println("_______________3.Soru_____________________");
        System.out.println();
        //Todo 2 4 8 16 32 , 2'nin üsleri
        for(int m = 1; m<100; m*=2){

            System.out.println(""+m);
        }





        System.out.println("_______________4.Soru_____________________");
        System.out.println();
        //Todo 1'den 5'e kadar 5'e tam bölünen sayılar
        for(int k=1; k<=5; k++)
            if(k%5==0)
                System.out.println(k);







    }
}
