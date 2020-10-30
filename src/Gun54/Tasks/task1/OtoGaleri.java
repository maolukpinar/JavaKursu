package Gun54.Tasks.task1;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {


        TeslaCar teslaCar = new TeslaCar("Tesla p90",310);
        ToyotaPirus toyota = new ToyotaPirus("pirus",1200);
        Bus otobus = new Bus("302",6000);

        teslaCar.print();
        IElectric.autoPilot();


        ArrayList<Vehicle> arabalar = new ArrayList<>();
        ArrayList<IVehicle> arabalar2 = new ArrayList<>();

        arabalar.add(teslaCar);
        arabalar.add(toyota);
        arabalar.add(otobus);

        for(Vehicle arac:arabalar)
        {
            System.out.println(arac.getClass().getSimpleName());
        }

    }
}
