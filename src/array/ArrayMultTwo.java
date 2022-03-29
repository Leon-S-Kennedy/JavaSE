package array;

import java.util.Arrays;

public class ArrayMultTwo {
    public static void transform(long[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]*=2;
        }
    }
    public static void main(String[] args) {
        long[] array={1,2,3,4,5,6,7,8};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
}
