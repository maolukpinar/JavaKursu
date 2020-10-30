package Mentor.Samil.Inheritance.Task1;

public class Ev {
    public static void main(String[] args) {

        BuyukDede buyukDede = new BuyukDede();//Ctrl+Alt+V ile otomatik oluşturuyor

        buyukDede.isim = "Hacı Ahmet";
        buyukDede.soyisim = "Hasanoğlu";
        buyukDede.yas = 100;
        buyukDede.meslek = "Çiftçi";
        buyukDede.tatlisever = true;

        System.out.println(buyukDede);

        Dede dede = new Dede("Mustafa");
        dede.boy =170;
        dede.torun = 15;
        dede.baston = false;

        System.out.println(dede);

    }
}

