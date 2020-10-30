package Gun49Inheritance.task4;

public class ilkOgrenci extends Ogrenci {
    public ilkOgrenci(String isim, String tipi) {
        super(sayacID++, isim, tipi);
    }
}
