package about_stream.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {

        FileReader fr = null;
        try {
            fr=new FileReader("src/about_stream/file/file.txt");
            //照葫芦画瓢
            char[] c=new char[4];
            int count;
            while((count=fr.read(c))!=-1){
                System.out.print(new String(c, 0, count));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
