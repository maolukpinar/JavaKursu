package Gun29Map;

import java.util.HashMap;
import java.util.Map;

public class javaHashMap2 {
    public static void main(String[] args) {

        Map<String , String> userMap=new HashMap<>();
        userMap.put("name", "Mehmet Akif Olukpınar");
        userMap.put("email","maolukpinar@gmail.com");
        userMap.put("adres","Düsseldorf/Deutchland");
        userMap.put("Mobil Tel","017632979633");

        System.out.println("userMap.get(\"name\") = " + userMap.get("name"));
        System.out.println("userMap.get(\"adres\") = " + userMap.get("adres"));


        Map<String , String> userMap2=new HashMap<>();
        userMap2.put("name", "Ayşe Yılmaz");
        userMap2.put("email","ayse@gmail.com");
        userMap2.put("adres","Köln/Deutchland");
        userMap2.put("Mobil Tel","017632978888");

        System.out.println("userMap2.get(\"name\") = " + userMap2.get("name"));
        System.out.println("userMap2.get(\"adres\") = " + userMap2.get("adres"));

        Map<String ,Map<String ,String >> kartvizitler=new HashMap<>();
        kartvizitler.put("Mehmet Akif",userMap);
        kartvizitler.put("Ayşe",userMap2);
        System.out.println("kartvizit = " + kartvizitler);

        String mehmetakifinAdresi=kartvizitler.get("Mehmet Akif").get("adres");
        System.out.println("mehmetakifinAdresi = " + mehmetakifinAdresi);
        System.out.println("kartvizit Ayşe = " + kartvizitler.get("Ayşe").get("Mobil Tel"));


    }
}
