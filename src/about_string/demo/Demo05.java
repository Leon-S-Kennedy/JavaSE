package about_string.demo;

public class Demo05 {
    public static void main(String[] args) {
        String s= "hello";
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(4));
    }
}
