import java.util.Arrays;

public class arraydemo {
    public static void main(String[] args) {

        long[] a;
        //System.out.println(a);变量 'a' 可能尚未初始化
        a=new long[10];
        a[9]=1;
        System.out.println(Arrays.toString(a));

        long[] b={1,2,34,4,3,5,6,6};
        System.out.println(Arrays.toString(b));

        long[] c;
        //c={1,23,3,4,5,6,7}; 此处不允许数组初始值设定项
        c=new long[]{1,23,4,5,6,7,8};
        System.out.println(Arrays.toString(c));

        long[] d=c;
        d[1]=2;
        System.out.println(Arrays.toString(d));
    }
}
