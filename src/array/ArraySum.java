package array;
public class ArraySum {
    public static double arrayavg(long[] array){
        double result=0;
        for (int i = 0; i < array.length; i++) {
            result+=array[i];
        }
        return result/array.length;
    }
    public static void main(String[] args) {
        long[] array={1,2,100,4,5,6,7,8};
        System.out.println(arrayavg(array));
    }
}
