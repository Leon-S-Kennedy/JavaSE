package array;

public class SwapDemo {
    private static void swap(double[] array, int a ,int b){
        double t=array[a];
        array[a]=array[b];
        array[b]= t;
    }
    public static void main(String[] args) {
        double a=1.0;
        double b=100.0;
        double[] array={a,b};
        System.out.println(a);
        System.out.println(b);
        swap(array,0,1);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
