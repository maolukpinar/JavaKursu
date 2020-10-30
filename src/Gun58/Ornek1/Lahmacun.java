package Gun58.Ornek1;

public class Lahmacun implements IFood {


    @Override
    public void taste() {
        System.out.println("Mükemmel yerel lezzetler");
    }

    @Override
    public double ucret() {
        return 2;
    }


    void dough() {
        System.out.println("Alman usulü olarak icine döner de ilave edilmistir :)");
    }

    void topping() {
        System.out.println("citir");
    }

    void bake() {
        System.out.println("tas firinda hazirlandi");
    }

    public void addMeat() {
    }
}




