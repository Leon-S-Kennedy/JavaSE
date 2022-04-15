package Exception.demo4;

import java.util.Scanner;

public class login {
    static class LogInExeception extends RuntimeException{
        public LogInExeception() {
        }

        public LogInExeception(String message) {
            super(message);
        }
    }
    public static void login() {

        System.out.println("请输入你的账号");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        System.out.println("请输入你的密码");
        scanner = new Scanner(System.in);
        String s2 = scanner.nextLine();
        if (s1.equals("937854328")&&s2.equals("password")) {
            System.out.println("恭喜你，登陆成功");
        }else{
            throw new LogInExeception("账号密码错误");
        }
    }

    public static void main(String[] args) {
        login();
    }
}
