package Gun51.Polymorphism.Ornek1;

public class Kedi extends Hayvan{
    public Kedi(String turu) {
        super(turu);
    }

    @Override
    public void ses() {
        System.out.println("miyavladı");
    }
}
