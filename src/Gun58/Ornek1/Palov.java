package Gun58.Ornek1;

public class Palov implements IFood {

        void fry(){
            System.out.println("kizart");
        }
        void boil() {
            System.out.println("kaynat, servis et");
        }
    @Override
    public void taste() {
        System.out.println("Çocukların vazgeçilmezi");
    }

    @Override
    public double ucret() {
        return 4;
    }
}
