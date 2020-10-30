package Mentor.Tahir;

import java.util.Arrays;

public class ArraySoruTahir {
    public static void main(String[] args) {


        //TODO verilen arrayin ilk ve son elemanin yazdirin
        //int[]nums={1,2,3,4,5}   ======>  [1,5]

        int[]nums={1,2,3,4,5};

        int first =nums[0];
        int last = nums[nums.length-1];

        int [] arr = new int[2];
        arr[0] =nums[0];
        arr[1]=nums[nums.length-1];

        System.out.println(Arrays.toString(arr));


    }
}
