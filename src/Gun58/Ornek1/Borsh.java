package Gun58.Ornek1;

public class Borsh implements IFood {
    void boil(){
        System.out.println("istenen sürede kaynatılıyor");
    }
    void eatTomorrow(){
        System.out.println("yarin yemeye hazır");
    }

    @Override
    public void taste() {
        System.out.println("Yeni tadlar denemek lazım");
    }

    @Override
    public double ucret() {
        return 3;
    }

    public void eatTomarrow() {
    }
}
