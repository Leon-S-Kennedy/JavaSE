package practice;

import java.util.Scanner;

public class printX {
    public static void printX(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i||j==n+1-i){
                    System.out.print("X");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n=scanner.nextInt();
            printX(n);
        }
    }
}
