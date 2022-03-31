package practice;
import java.util.Scanner;

public class hexToDec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char c[]=string.toCharArray();    //将字符串对象中的字符转换为一个字符数组
        //int sum = 0;
        long sum = 0;	//数据范围上，不超过8位的十六进制数，所以计算总和的sum应该声明为long型，而不是int型，否则会出错。
        int n = c.length;
        for (int i = 0; i < n; i++) {
            if((int)c[i]-48>9){
                if(c[i]=='A')
                    sum+=10*Math.pow(16,n-i-1);
                else if(c[i]=='B')
                    sum+=11*Math.pow(16,n-i-1);
                else if(c[i]=='C')
                    sum+=12*Math.pow(16,n-i-1);
                else if(c[i]=='D')
                    sum+=13*Math.pow(16,n-i-1);
                else if(c[i]=='E')
                    sum+=14*Math.pow(16,n-i-1);
                else if(c[i]=='F')
                    sum+=15*Math.pow(16,n-i-1);
            }
            else{
                sum+=((int)c[i]-48)*Math.pow(16,n-i-1);
            }
        }
        System.out.println(sum);
    }

}
