package Gun53Interface.Tasks.task1;

public class Cember implements ISekiller{


    @Override
    public int cevresi(int... dizi) {
        return (int)(2*dizi[0]*ISekiller.PI);
    }

    @Override
    public int alani(int... dizi) {
        return (int)(ISekiller.PI*dizi[0]*dizi[0]);
    }
}
