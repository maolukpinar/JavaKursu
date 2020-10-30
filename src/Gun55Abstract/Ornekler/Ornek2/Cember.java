package Gun55Abstract.Ornekler.Ornek2;

public class Cember extends Sekil {

    private double yaricap;

    public Cember(String name, double yaricap) {
        super(name);
        this.yaricap = yaricap;
    }

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alan() {
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double cevre() {
        return 2 * Math.PI * yaricap;
    }
}
