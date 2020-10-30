package Gun31ClassAndObject;


public class JavaClassAndObcekt {
    public static void main(String[] args) {
        Araba araba1=new Araba();//Nesne, Araba sınıfından türetildi
        araba1.model = "Toyota Camry";
        araba1.motorHacmi =1600;
        araba1.yili = 2020;

        System.out.println("araba1.yili = " + araba1.yili);
        System.out.println("araba1.motorHacmi = " + araba1.motorHacmi);
        System.out.println("araba1.model = " + araba1.model);
    }

}
//1.Yöntem
    class Araba{
    //Properties, Attributes, fields
    String model;
    int yili;
    double motorHacmi;
}