package Gun60OCASorulari;

public class S24 {
    public static void main(String[] args) {

        String[] strs=new String[2];
        int idx=0;

        // concat de ilk eklenecek değerler nul olmamalı
        for (String s: strs) {
            //strs[idx]=strs[idx] + (" element " + idx); // bu şekilde olsaydı hata vermezdi..
            strs[idx].concat(" element " + idx); //   String b="ismet",   b.concat("temur") -> b + "temur" -> "ismettemur"
            idx++;
        }

        for (idx=0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }

        // Exception in thread "main" java.lang.NullPointerException
//        int a=5;
//        a+2;  önceki a ya eşitleme olmadığından a = 7 olmayacak. a = a+2 olsaydı 7 olurdu.

    }
}

