package Gun25_Proje;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {



        /*Soru 2:
getPopulation:
      main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
      countryNames Ülke isimleri
      countryPopulations Ülke nüfusları

    populationOfCountry adında bir metod yaznız.
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak

    Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
    göndersin.

      Ornegin;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger (ulkeAdi) icin verilen ulke countryNames icinde yoksa return -1 olmali


         */


            Scanner oku=new Scanner(System.in);
            System.out.print("Bir ulke ismi giriniz:");
            String ulke=oku.nextLine();

            String[] countryNames = {"USA" ,"Mexico" ,"Canada"};

            int[] countryPopulations = {100000 , 120000 , 130000};

            System.out.println(populationOfCountry(countryNames,countryPopulations,ulke));

        }


        public static int populationOfCountry(String ulkeler[],int nufuslar[],String ulke){
            int value=0;

            for (int i = 0; i < ulkeler.length; i++) {

                if (ulke.equalsIgnoreCase(ulkeler[i])){
                    value=nufuslar[i];
                    break;
                }
                else value=-1;
            }
            return value;



        }
}
