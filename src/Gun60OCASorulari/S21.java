package Gun60OCASorulari;

public class S21 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int i=0;
        do {
            System.out.print(arr[i]+" "); // i => 0,1,2,3
            i++;
        }while (i < arr.length+1 );// 5 sınır olmuş oluyor yani 4 nolu indexteki elemanı yazmaya çalışıyor
    }
}
// 1 2 3 4 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

