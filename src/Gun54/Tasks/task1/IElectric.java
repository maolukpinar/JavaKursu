package Gun54.Tasks.task1;

public interface IElectric extends IVehicle{
    final static int batteryLife=100;

    String changeBattery();


    default void print()
    {
        System.out.println("default belirteciyle metod yazılabilir");
    }

    static void autoPilot()
    {
        System.out.println("otonom sürüş modu");
    }


}
