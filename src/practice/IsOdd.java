package practice;

public class IsOdd {
    public static void isodd(int n){
        if((n&1)==0){
            System.out.println("是偶数");
        }else{
            System.out.println("是奇数");
        }
    }

    public static void main(String[] args) {
        isodd(0);
    }
}
