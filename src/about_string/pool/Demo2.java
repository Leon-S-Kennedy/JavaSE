package about_string.pool;

public class Demo2 {
    public static void main(String[] args) {
        char[] c={'a','e','t','w'};
        String s=new String(c);
        String t=s.intern();
        System.out.println(t==s);
    }

}
