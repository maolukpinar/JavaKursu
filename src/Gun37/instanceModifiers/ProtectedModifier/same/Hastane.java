package Gun37.instanceModifiers.ProtectedModifier.same;

public class Hastane {
    public static void main(String[] args) {
        Doktor dr=new Doktor();
        dr.ad="Ahmet";
        dr.print();

        Doktor dr2=new Doktor("Ayşe");
    }
}
