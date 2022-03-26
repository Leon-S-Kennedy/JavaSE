package array;

import java.util.Arrays;

public class UseArray {
    public static void main1(String[] args) {
        long[] array={1,3,6,8,5,9,4};
        Arrays.sort(array,1,5);
        for (long l : array) {
            System.out.println(l);
        }
    }

    public static void main2(String[] args) {
        long[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.binarySearch(array, 5));
    }

    public static void main3(String[] args) {
        long[] array1={1,2,3,4,5,6,7,8,9,10};
        long[] array2={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.equals(array1, array2));
        //如果使用==则是说明两边是否指向同一个对象
    }

    public static void main4(String[] args) {
        long[] array={1,2,3,43,43,5,23};
        Arrays.fill(array,5);
        for (long l : array) {
            System.out.println(l);
        }
    }

    public static void main5(String[] args) {
        long[] array={1,2,3,4,5,65,7,4,67};
        long[] longs = Arrays.copyOf(array, 6);
        for (long l : longs) {
            System.out.println(l);
        }
        System.out.println("-----------------------------------------");
        long[] longs1 = Arrays.copyOfRange(array, 2, 5);
        for (long l : longs1) {
            System.out.println(l);
        }
        System.out.println("-----------------------------------------");
        long[] longs2 = Arrays.copyOfRange(array, 2, 11);
        for (long l : longs2) {
            System.out.println(l);
        }
        //long[] longs3 = Arrays.copyOfRange(array, -1, 5);
    }

    public static void main(String[] args) {
        long[] array={1,2,3,4,5,6,7,78};
        System.out.println(array);
        String s = Arrays.toString(array);
        System.out.println(s);
    }
}
