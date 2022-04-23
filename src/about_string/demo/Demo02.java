package about_string.demo;

public class Demo02 {
    public static void main(String[] args) {
        String s1="HELLO";
        String s2="hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
