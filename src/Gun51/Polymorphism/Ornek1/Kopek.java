package Gun51.Polymorphism.Ornek1;

public class Kopek extends Hayvan {

    public Kopek(String turu) {
        super(turu);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }
    public void kokladi()
    {
        System.out.println("köpek kokladı");
    }
}
