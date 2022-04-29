package about_stream.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInput {
    public static void main1(String[] args) {
        FileInputStream file=null;
        try {
            file = new FileInputStream("src/about_stream/file/temp.txt");

            //此处开始读
/*
            while (true){
                int read = file.read();
                if(read==-1){
                    break;
                }
                System.out.println(read);
            }
*/


            int read;
            while ((read=file.read())!=-1){
                System.out.println(read);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) { //避免空指针异常
                try {
                    file.close();   //记得关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main2(String[] args) {
        FileInputStream file=null;
        try {
            file = new FileInputStream("src/about_stream/file/temp.txt");

            //此处开始读
            byte[] b=new byte[4];

            int readCouunt = file.read(b);//返回读到的字节数
            String x = new String(b,0,readCouunt);
            System.out.println(x);

            readCouunt = file.read(b);//返回读到的字节数
            String y = new String(b,0,readCouunt);
            System.out.println(y);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) { //避免空指针异常
                try {
                    file.close();   //记得关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        FileInputStream file=null;
        try {
            file = new FileInputStream("src/about_stream/file/temp.txt");
            byte[] b=new byte[4];
/*
            while (true){
                int readCount = file.read(b);
                if(readCount==-1){
                    break;
                }
                System.out.print(new String(b, 0, readCount));
            }
*/
            int readCount;
            while ((readCount=file.read(b))!=-1){
                System.out.print(new String(b, 0, readCount));
            }
/*
            System.out.println("总字节数量"+file.available());
            byte[] bytes= new byte[file.available()];
            int read = file.read(bytes);
            System.out.println(new String(bytes));
            //此种方式不适合大文件
*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
