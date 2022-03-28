package array;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(long[] array,long key){
        int left=0,right= array.length-1;
        while(left<=right){
            int search=(left+right)/2;
            if(array[search]<key){
                left=search+1;
            }
            if(array[search]>key){
                right=search-1;
            }
            if(array[search]==key){
                return search;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        long[] array = {1, 4, 3, 2, 5, 7, 6, 9, 8, 1, 11, 10};
        BubbleSort.bubblesort(array);
        System.out.println(Arrays.toString(array));
/*
        for (long l : array) {
            System.out.println(l);
        }
*/
        System.out.println(binarySearch(array,5));

    }
}
