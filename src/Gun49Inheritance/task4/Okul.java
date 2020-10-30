package Gun49Inheritance.task4;

public class Okul {
    public static void main(String[] args) {
        
       LiseOgrencisi lo = new LiseOgrencisi("ahmet","Lise");
       LiseOgrencisi lo2 = new LiseOgrencisi("ali","Lise");
       
       ilkOgrenci io1 = new ilkOgrenci( "ayşe","ilk");

        System.out.println("lo = " + lo);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
    }
}
