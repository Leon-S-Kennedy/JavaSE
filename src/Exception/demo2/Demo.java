package Exception.demo2;

public class Demo {
    public static void main(String[] args) {
        try {
            int[] a=new int[10];
            a[100]=122;
        }catch (IndexOutOfBoundsException exc){
            exc.printStackTrace(System.out);
        }catch (RuntimeException exc){
            exc.printStackTrace(System.out);
        }
    }
}
