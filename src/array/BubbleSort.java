package array;

public class BubbleSort {
    private static void swap(long[] array,int a,int b){
        long t=array[a];
        array[a]=array[b];
        array[b]= t;
    }
    public static void bubblesort(long[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }
    public static void bubblesort(long[] array,int a,int b){
        for(int i=a;i<b;i++){
            for(int j=a;j<b-i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        long[] a={9,3,7,8,5,4,3,2,8};
        bubblesort(a);
        for (long l : a) {
            System.out.println(l);
        }
    }
}
