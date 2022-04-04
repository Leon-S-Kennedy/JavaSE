package practice;

import java.util.Scanner;

public class printDigtal2 {
    public static void printdigtal2(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的数字");
        int n = scanner.nextInt();
        printdigtal2(n);
    }
}
