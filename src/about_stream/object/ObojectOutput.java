package about_stream.object;

import oop.demo.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObojectOutput {
    public static void main(String[] args) throws Exception {
        Person p=new Person(123,"aaa");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/about_stream/object/Person.txt"));

        oos.writeObject(p);

        oos.flush();
        oos.close();
    }
}
