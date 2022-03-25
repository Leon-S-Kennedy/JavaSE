public class method00 {
    public static long func(int n) {
        if(n<0){
            throw new RuntimeException("好歹大于零吧！！");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * func(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
