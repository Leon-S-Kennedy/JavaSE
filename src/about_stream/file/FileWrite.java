package about_stream.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("src/about_stream/file/file01.txt");
            fw.write('我');
            fw.write(new char[]{'是','一','个','孤','独'});
            String s="的飞行员，孤独的";
            fw.write(s,0,s.length());
            fw.write("制造地对空导弹。");

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
