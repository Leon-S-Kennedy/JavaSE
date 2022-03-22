public class fib {
    public static long fun1(long a){
        if(a==1||a==2){
            return 1;
        }else return fun1(a-1)+fun1(a-2);
    }
    public static long fun2(long n){
        if(n==1||n==2){
            return 1;
        }else{
            long last1=1;
            long last2=1;
            long cur=0;
            for(int i=3;i<=n;i++){
                cur=last2+last1;
                last2=last1;
                last1=cur;
            }
            return cur;
        }
    }

    public static void main(String[] args) {
        System.out.println(fun1(8));
        System.out.println(fun2(8));
    }
}
