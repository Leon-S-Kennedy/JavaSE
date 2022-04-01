package practice;

import java.util.Scanner;

public class printDigtal {
    public static void printdigtal(int n) {
        System.out.println(n % 10);
        if (n > 10) {
            printdigtal(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的数字");
        int n = scanner.nextInt();
        printdigtal(n);
    }
}
