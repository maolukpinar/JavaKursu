package Gun49Inheritance.task3;

public class ABMain {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("a oluştuğunda  = " + A.mesaj);




        B b = new B();
        {
            System.out.println("b oluşturulduğunda = " + B.mesaj);
        }


        System.out.println("b den sonra a nın durumu = " + A.mesaj);
        //Statik değişkenlerin olduğu classlardan oluşturulan subclaslarda, değişkenin
        //değeri değiştirildiğinde, super classdaki de değişir.
        //Çünkü static değişkenler hafızada tek bir değeri gösterirler.
    }
}
