import java.util.Random;
import java.util.Scanner;

public class inputOutputMethod {
    public static void main(String[] args) {
        //System.out.println(method00.func(5));
        Random random = new Random(200421088);
        int toGuss=random.nextInt(100)+1;
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i=scanner.nextInt();
            if(i>toGuss){
                System.out.println("大了");
            }
            else if(i<toGuss){
                System.out.println("小了");
            }
            else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }

/*
        String line=scanner.nextLine();
        System.out.println(line);

        line=scanner.nextLine();
        System.out.println(line);

        line=scanner.nextLine();
        System.out.println(line);

        line=scanner.nextLine();
        System.out.println(line);
*/
/*
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        System.out.println("结束");
*/

    }
}
