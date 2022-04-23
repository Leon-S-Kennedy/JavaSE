package about_string.pool;

public class Demo {
    public static void main(String[] args) {
        String s="hello";
        String t="hello";
        System.out.println(s.equals(t)); //true
        System.out.println(s==t);       //我们不应比较两个字符的同一性问题

        String u=new String("hello");//默认不入池
        System.out.println(s.equals(u));
        System.out.println(s==u);

        String v=u.intern();
        System.out.println(v==u);
        System.out.println(v==s);

    }
}
