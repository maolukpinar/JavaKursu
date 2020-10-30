package Gun38.FinalModifier.example3;

public class ex3 {

    final String name;

    public ex3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
     ex3 ornek1 =new ex3("Ayşe");
     ex3 ornek2 = new ex3("Ali");


     //ornek1.name ="Ali"; final olduğu için ilk değer atama sonrası değiştirilemez
     //ornek2.name ="Zeynep"; final olduğu için ilk değer atama sonrası değiştirilemez


        System.out.println("ornek1 = " + ornek1.name);
        System.out.println("ornek2 = " + ornek2.name);


    }
}
