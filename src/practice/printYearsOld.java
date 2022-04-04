package practice;

import java.util.Scanner;

public class printYearsOld {
    public static void printYears(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int y=scanner.nextInt();
        if(y<0){
            throw new RuntimeException("请从新输入");
        }else if(y<18){
            System.out.println("少年");
        }else if(y<29){
            System.out.println("青年");
        }else if (y<56){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }

    public static void main(String[] args) {
        printYears();
    }
}
