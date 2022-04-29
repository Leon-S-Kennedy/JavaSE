package about_stream.object.multi;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInput {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream( new FileInputStream("src/about_stream/object/multi/User.txt"));

        Object o = ois.readObject();
        List<User> o1 = (List<User>) o;
        for (User user : o1) {
            System.out.println(user);
        }


        ois.close();
    }
}
