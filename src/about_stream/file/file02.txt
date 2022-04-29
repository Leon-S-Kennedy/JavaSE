package about_stream.file.about_copy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txtCopy {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;

        try {
            fr=new FileReader("src/about_stream/file/about_copy/txtCopy.java");
            fw=new FileWriter("src/about_stream/file/file02.txt");

            char[] chars=new char[512*1024];
            int count;
            while ((count= fr.read(chars))!=-1){
                fw.write(chars,0,count);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
