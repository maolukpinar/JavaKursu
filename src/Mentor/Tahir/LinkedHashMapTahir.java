package Mentor.Tahir;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapTahir {

    public static void main(String[] args) {

        //ToDo 5 tane ulke ismi ve nufusunu yazıyorsunuz

        LinkedHashMap<String, Integer> country = new LinkedHashMap<>();

        country.put("Almanya", 800000);
        country.put("Avusturya", 65000);
        country.put("Türkiye", 830000);
        country.put("Yunanistan", 10000);
        country.put("Romanya", 200000);
        System.out.println("country = " + country);

        System.out.println(country);
        System.out.println("_________________________________________________");
        System.out.println(country.keySet());
        for (String str : country.keySet())
        {
            System.out.println(str);
        }

        System.out.println("_________________________________________________");
        System.out.println(country.values());
        for (Integer i:country.values()) {
            System.out.println(i);
        }
        System.out.println("_________________________________________________");

        int toplam =0;
        for (Integer i:country.values()) {

            toplam=toplam+i;

        }
        System.out.println(toplam);

        System.out.println("_________________________________________________");

        int sum = 0;
        for(Map.Entry<String,Integer> i: country.entrySet()){

            int nufus=i.getValue();

            sum=sum+nufus;

        }
        System.out.println(sum);
        System.out.println("_________________________________________________");

        int count = 0;
        for(Map.Entry<String,Integer> i: country.entrySet()){

            int nufus=i.getValue();
            if(nufus<500000){
                count++;
                System.out.println(i.getKey() +i.getValue());
            }


        }


    }
}