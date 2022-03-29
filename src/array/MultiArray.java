package array;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        long[][] a={
                {1,2,3},
                {4},
                {5,6,7,8,9},
                null,
                {10}
        };
        long[][] array=new long[][]{
            new long[]{1,2},
            new long[]{1,2,3,4},
            new long[]{1,2,3}
        };

        String[][] s=new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = "Good";
        s[0][1] = "Luck";
        s[1][0] = "to";
        s[1][1] = "you";
        s[1][2] = "!";

        System.out.println(a[1][0]);
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(s[0]));
        System.out.println(Arrays.toString(s[1]));
    }
}
