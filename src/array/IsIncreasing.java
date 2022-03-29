package array;

public class IsIncreasing {
    public static boolean isincreasing(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array={2,2,2,2,3,6,7,8,9,10};
        System.out.println(isincreasing(array));
    }
}
