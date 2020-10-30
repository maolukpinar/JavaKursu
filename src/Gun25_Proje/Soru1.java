package Gun25_Proje;

public class Soru1 {


        /*CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.

            Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel

         */

        public static void camelcase(String a) {
            String kck = a.toLowerCase();
            String[] strarr = kck.split(" ");
            for (int i = 0; i < strarr.length; i++) {
                String upp = strarr[i].substring(0, 1).toUpperCase();
                System.out.print(upp + strarr[i].substring(1) + " ");

            }
        }

        public static void main(String[] args) {
            camelcase("bugün hava çok güzel");
        }



    }


