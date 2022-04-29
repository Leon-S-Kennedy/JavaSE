package about_stream.object.multi;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutput {
    public static void main(String[] args) throws Exception {
        User u1=new User(1,"aa");
        User u2=new User(2,"ab");
        User u3=new User(3,"ac");
        User u4=new User(4,"ad");
        User u5=new User(5,"ae");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/about_stream/object/multi/User.txt"));
        List<User> users=new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        oos.writeObject(users);

        oos.flush();
        oos.close();
    }
}
