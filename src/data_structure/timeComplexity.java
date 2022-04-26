package data_structure;

import java.util.Random;

public class timeComplexity {
    public static void sort(long[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    long t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
    private static final Random random=new Random(20211209);
    public static long[] make(int n){
        long[] array=new long[n];
        for (int i=0;i<n;i++){
            array[i]=random.nextInt(100);
        }
        return array;
    }

    public static void main(String[] args) {
        long[] a1=make(40000);
        long[] array=make(80000);

        long c=System.currentTimeMillis();
        sort(a1);
        long d=System.currentTimeMillis();
        System.out.println((d-c)/1000.0);

        long a=System.currentTimeMillis();
        sort(array);
        long b=System.currentTimeMillis();
        System.out.println((b-a)/1000.0);

    }

}
