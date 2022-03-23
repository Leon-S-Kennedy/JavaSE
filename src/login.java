import java.util.Scanner;

public class login {
    public static void login() {
        int i = 0;
        while (i < 3) {
            System.out.println("请输入你的密码");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            i++;
            if (s.equals("password")) {
                System.out.println("恭喜你，登陆成功");
                break;
            }
        }
    }

    public static void main(String[] args) {
        login();
    }
}
