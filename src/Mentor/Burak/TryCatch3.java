package Mentor.Burak;

public class TryCatch3 {
    public static void main(String[] args) {

        System.out.println("Kodunuz başlatılıyor");

        int sayi =0;
        int[] arr = new int[3];

        try {
            sayi = 2/0;
            arr [4] =10;
        }catch (ArithmeticException bolmeHatasi){
            System.out.println(bolmeHatasi.getMessage());
        }catch (ArrayIndexOutOfBoundsException arrayHatasi){
            System.out.println(arrayHatasi.getMessage());
        }
        System.out.println("Kodumuz bitiriliyor");

    }
}
