package Gun58.Ornek1;

public class AdanaKebap implements IFood {


    @Override
    public void taste() {
        System.out.println("Etin en güzel hallerinden biri");

    }

    @Override
    public double ucret() {
        return 5.0;
    }


    public void marinade() {
        System.out.println("uzun süre marine edildi");
    }

    public void grill() {
        System.out.println("odun ateşinde yapıldı");
    }

}
