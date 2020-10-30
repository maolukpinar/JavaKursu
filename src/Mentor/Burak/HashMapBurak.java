package Mentor.Burak;

import java.util.HashMap;

public class HashMapBurak {
    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon", "296 Euro");
        map.put("Ebay", "278 Euro");
        map.put("Saturn", "300 Euro");
        map.put("Mediamarkt", "310 Euro");
        map.put("Apple Store", "340 Euro");

        System.out.println("Map'in boyutu: "+ map.size());//5 key var demek

        HashMap<String , String > map2 = new HashMap<>();
        System.out.println("-------------------1.YOL----------------------------");

        map2 = new HashMap<>(map);
        System.out.println("Map2 ="+ map2);

        System.out.println("--------------------2.YOL----------------------------");

        map2.putAll(map);
        System.out.println("map2 ="+map2);
        System.out.println("----------------İçini Temizlemek İçin-----------------");
       // System.out.println(".clear'dan önce map: "+map);
       //map.clear();
        //System.out.println(".clear'dan sonra map: "+map);
       //System.out.println(map.isEmpty());

        System.out.println("------------containsKey Methodu--------------------");
        String key = "Saturn";
        if (map.containsKey(key))//contains = içinde bulundurmak demek
        {
            System.out.println("Değer(Value): "+map.get(key));
        } else {
            System.out.println("Bu map'de bununla alakalı birşey yok");
        }




    }
}
