package file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {
    public static void main1(String[] args) {
        //1.判断文件是否存在
        File file = new File("D:/text.txt");
        System.out.println(file.exists());
    }

    public static void main2(String[] args) throws IOException {

        File file = new File("D:/javaFile/ja/text.txt");
        PrintWriter writer = new PrintWriter(file, "UTF-8");
        //writer的使用和system.out差不多
        //1.如果对应文件 存在 并且是目录，就会以异常的形式报错
        //2.如果对应文件 存在 并且不是目录，就会完全覆盖原来的内容
        //3.如果对应文件 不存在 并且其父目录是存在的，就会自动新建文件
        //4.如果对应文件 不存在 并且其父目录也是不存在的，就会以异常的形式报错

        writer.println("我是一个孤独的飞行员，孤独的制造地对空导弹！");

        //writer 必须进行flush操作
        writer.flush();
        //记得关闭
        writer.close();
    }

    public static void main(String[] args) throws IOException {

        File file = new File("D:/javaFile/ja/text.txt");
        Scanner scanner = new Scanner(file,"UTF-8");
        //Scanner对象是从文件中以UTF-8字符集进行内容的读取
/*
        String line=scanner.nextLine();
        System.out.println(line);
         line=scanner.nextLine();
        System.out.println(line);
*/
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            System.out.println(line);
        }
        //记得关闭文件
        scanner.close();
    }
}
