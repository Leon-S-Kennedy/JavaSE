package about_stream.print;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    //标准的字节输出流，输出到控制台（这个不需要关闭）
    public static void main(String[] args) throws Exception {
        PrintStream ps=System.out;

        ps.println("hello world!!!");

        //合起来写
        System.out.println("hello world!!!");
        /*
        * 修改标准输出流的输出方向，将其输出到一个问价中
        *
        * */
        //标准输出流不再指向控制台而是指向一个文件
        PrintStream printStream=new PrintStream(new FileOutputStream("src/about_stream/print/log.txt"));
        //修改输出方向到printStream中
        System.setOut(printStream);
        printStream.println("hello world!!!");
        printStream.println("hello world!!!");
        printStream.println("hello world!!!");
    }
}
