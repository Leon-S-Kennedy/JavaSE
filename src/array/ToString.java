package array;

public class ToString {
    public static String tostring(long[] array){
        String r ="[";
        for (int i = 0; i < array.length-1; i++) {
            r+=array[i]+",";
        }
        if(array.length>=1){
            r+=array[array.length-1];
        }
        r+="]";
        return r;
    }
    public static void main(String[] args) {
        long[] array={};
        System.out.println(array);
        System.out.println(tostring(array));
    }
}
