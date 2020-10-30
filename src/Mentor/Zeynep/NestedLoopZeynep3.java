package Mentor.Zeynep;

public class NestedLoopZeynep3 {
    public static void main(String[] args) {


        //todo 2.
        // A
        // B B
        // C C C
        // D D D D
        // E E E E E
        // F F F F F F

        int alfabe = 65;
        for(int i=0; i<=5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print( (char)(alfabe)+" "  );
            }
            alfabe++;
            System.out.println();
        }


    }
}
