package about_stream.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        FileOutputStream file = null;

        try {
            //此种方法谨慎使用，会将原文件清空再重新写
            file = new FileOutputStream("src/about_stream/file/temp01.txt");//append=true表示以追加的方式,注意，是下次执行的时候追加，执行还没结束的时候光标是跟着动的
            //此处开始输出
            byte[] b=new byte[]{97,98,99,100,101,102};
            file.write(b);


            file.flush();       //记得flush()操作
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(file!=null){
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
