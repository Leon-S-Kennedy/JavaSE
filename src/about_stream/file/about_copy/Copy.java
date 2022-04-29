package about_stream.file.about_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try {
            fis=new FileInputStream("src/about_stream/file/大话数据结构彩色.pdf");
            fos=new FileOutputStream("src/about_stream/file/DHSJJG.pdf");

            //此处为重点，如何一边读一边写
            byte [] b=new byte[1024*1024];
            int read;
            while((read=fis.read(b))!=-1){
                fos.write(b,0,read);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //此处为什么不写在一块？
            //因为，万一一个抛出异常，另外一个就不执行了。

            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
