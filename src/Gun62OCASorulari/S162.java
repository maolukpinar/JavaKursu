package Gun62OCASorulari;

public class S162 {
    int count;//burası static int count; olmalıydı hata vermemesi için

    public static void displayMsg(){

 //       count++;                                                   // line n1
  //      System.out.println("Welcome "+" Visit Count: " + count);   // line n2
        //Static bir metodun içerisine dışardan çağrılan metod veya fieldlar mutlak suret STATİC olmalı
    }

    public static void main(String[] args) {

        S162.displayMsg();       // line n3
        S162.displayMsg();      // line n4
    }
}

