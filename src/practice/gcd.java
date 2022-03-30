package practice;

import java.util.Scanner;

public class gcd {
    public static int getGcd(int a,int b){
        int min=Integer.min(a,b);
        for(int i=min;i>=1;i--){
            if(a%i==0&&b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数");
        while (scanner.hasNextInt()) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(getGcd(a,b));
        }
    }
}
