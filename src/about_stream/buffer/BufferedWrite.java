package about_stream.buffer;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BufferedWrite {
    public static void main(String[] args) throws Exception {
        BufferedWriter reader=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/about_stream/buffer/BufferFile.txt")));
        reader.write("我是一个孤独的飞行员，孤独的制造地对空导弹。");
        reader.write("\n");
        reader.write("hello world!!!");



        reader.flush();
        reader.close();
    }
}
