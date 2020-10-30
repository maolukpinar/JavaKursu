package Gun31ClassAndObject;

//2.Yöntem
public class Personel {
    int id;
    String name;
    String surname;


    public static void main(String[] args) {
        Personel mudur=new Personel();
        mudur.id=1;
        mudur.name="Mehmet";
        mudur.surname="Yılmaz";

        System.out.println("mudur id= " + mudur.id);
        System.out.println("mudur name= " + mudur.name);
        System.out.println("mudur surname= " + mudur.surname);

    }
}
