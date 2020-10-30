package Gun37.instanceModifiers.PrivateModifier.same;

public class company {
    public static void main(String[] args) {


        Person personel=new Person();
        personel.id=1;
        personel.name="Ahmet";
        personel.username="ahmet";
       // personel.password="1234";
        //burası private olduğundan direk erişilemez

        personel.Sifrebelirle("1234a");

        personel.SifreGoster();


    }
}
