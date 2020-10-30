package Mentor.Burak;

public class TryCatch1 {
    public static void main(String[] args) {

        //todo                  try=catch
        //todo        try = dene   ,   catch = yakala


        System.out.println("Kodumuz çalışmaya başlıyor");
        int sayimiz = 0;

        try {
            sayimiz = 2/0;
            System.out.println("Bu sitring Try'in içindedir");
        }catch (ArithmeticException bolmeHatasi){
            System.out.println(bolmeHatasi.getMessage());
        }


        System.out.println(sayimiz);
        System.out.println("Kodunuz bitiyor");

    }
}
