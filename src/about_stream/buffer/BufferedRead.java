package about_stream.buffer;

import java.io.*;

public class BufferedRead {
    public static void main1(String[] args) throws Exception {
        FileReader fr = new FileReader("src/about_stream/file/file02.txt");
        BufferedReader reader = new BufferedReader(fr);
        String s=null;
        while ((s=reader.readLine())!=null){
            System.out.println(s);
        }

        reader.close();//只需要关闭最外层的包装流，不用主动关闭节点流。
    }
    public static void main(String[] args) throws Exception {
        //字节流
        FileInputStream fr = new FileInputStream("src/about_stream/file/file02.txt");

        //字节流转换为字符流
        InputStreamReader reader=new InputStreamReader(fr);

        BufferedReader bufferedReader = new BufferedReader(reader);
        String s=null;
        while ((s=bufferedReader.readLine())!=null){
            System.out.println(s);
        }

        bufferedReader.close();//只需要关闭最外层流
    }

}
