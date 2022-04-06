package practice;

public class Hanoi {
    static long count=0;
    public static void hanoi(int n, String src, String dest, String aux) {
        count++;
        if(n<0){
            throw new RuntimeException("盘子个数必须大于1\n");
        }
        if(n==1){
            System.out.printf("把一个盘子从%s上移动到%s上！\n",src,dest);
        }else{
            hanoi(n-1,src,aux,dest);
            System.out.printf("把一个盘子从%s上移动到%s上！\n",src,dest);
            hanoi(n-1,aux,dest,src);
        }
    }
    public static void main(String[] args) {
        hanoi(7,"第1个盘子","第3个盘子","第2个盘子");
        System.out.println(count);
    }
}
