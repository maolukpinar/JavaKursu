package Gun21Matris;

public class JavaMatSoru2 {
    public static void main(String[] args) {

        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

          //todo 1. yöntem


    /*        int[][] array = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

            int max = array[0][0];
            for (int i = 0; i < array.length; i++) 
            {
                for (int j = 0; j < array[0].length; j++)
                {
                    if (array[i][j] > max)
                        max = array[i][j];

                }
            }
            System.out.println(max);  */
        

            //todo 2.yöntem

        int [][] mat={{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

       int max =0;
        
        for (int i=0; i<4; i++){//i<4; yerine mat.length; yazabiliriz
            
            for(int j=0; j<3; j++){// 3 ün yerine mat[i].length; yazabiliriz satırı temsil eder.
                
                if (mat[i][j] >  max)
                    max=mat[i][j];
            }
        }

        System.out.println("max = " + max);


        }
    }
