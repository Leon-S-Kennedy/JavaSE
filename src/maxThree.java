public class maxThree {
    public static int max(int a,int b){
        return a > b ? a:b ;
    }
    public static int max_three(int a,int b,int c){
        return max(max(a,b),c);
    }
    public static void main(String[] args) {
        System.out.println(max_three(1,54,23));
    }
}
