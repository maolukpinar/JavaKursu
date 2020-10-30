package Gun54.Tasks.task1;

public class TeslaCar extends Vehicle implements IElectric {

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "10 yılda bir batarya değiştir.";
    }

    @Override
    public String drive() {
        return "hızlı sür, Auto pilot sür";
    }
}
