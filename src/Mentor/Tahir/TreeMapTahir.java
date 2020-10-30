package Mentor.Tahir;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTahir {
    public static void main(String[] args) {

        Map<Integer, String> hashMap=new HashMap<>();
        Map<Integer, String> LinkedMap=new LinkedHashMap<>();
        Map<Integer, String> treeMap=new TreeMap<>();

        hashMap.put(10,"Java");
        hashMap.put(20,"PHP");
        hashMap.put(2,"Pyton");
        hashMap.put(57,"C++");
        hashMap.put(89,"C#");
        hashMap.put(40,"JavaScript");

        for (Map.Entry<Integer, String >entry:hashMap.entrySet()){
            System.out.println("Keys "+entry.getKey()+" value "+entry.getValue());
        }





    }
}
