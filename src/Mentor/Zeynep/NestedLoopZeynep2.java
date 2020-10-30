package Mentor.Zeynep;

public class NestedLoopZeynep2 {
    public static void main(String[] args) {

//todo 1.
        // A
        // A B
        // A B C
        // A B C D
        // A B C D E
        // A B C D E F

        int alfabe = 65;

        for(int i=0; i<=5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print( (char)(alfabe+j)+" "  );
            }
            System.out.println();
        }










    }
}
