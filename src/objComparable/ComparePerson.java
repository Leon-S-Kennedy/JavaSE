package objComparable;

public class ComparePerson {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.height=177;
        Person p2=new Person();
        p2.height=180;
        Person p3=new Person();
        p3.height=192;

        int r=p1.compareTo(p2);
        if(r<0){
            System.out.println("p1<p2");
        }
        else if(r>0){
            System.out.println("p1>p2");
        }
        else{
            System.out.println("p1=p2");
        }
    }
}
