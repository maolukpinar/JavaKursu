package Mentor.Sema;

public class TwoDArraysSema {
    public static void main(String[] args) {

/*
     int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
      verilen Array icinde
    --> kac tane rakam oldugunu return eden  methodu yazdiriniz
     */

            int[][] array={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

            System.out.println(kacRakamVar(array));
        }

        public static int kacRakamVar (int [][] intArr){

            int count=0;

            for (int i = 0; i <intArr.length ; i++) {
                for (int j = 0; j <intArr[i].length ; j++) {

                    count++;

                }

            }
            return count;
        }
        }
