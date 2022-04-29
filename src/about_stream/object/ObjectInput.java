package about_stream.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInput  {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/about_stream/object/Person.txt"));

        Object o = ois.readObject();
        System.out.println(o);


        ois.close();
    }
}
