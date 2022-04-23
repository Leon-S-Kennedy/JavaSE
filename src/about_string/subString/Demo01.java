package about_string.subString;

public class Demo01 {
    public static void main(String[] args) {
        String[] s={
                "a.q",
                "a.w",
                "a.e",
                "a.r",
                "a.t",
                "a.y",
        };
        for (String s1 : s) {
            int i = s1.indexOf(".");
            System.out.println("后缀:"+s1.substring(i + 1));
        }
    }
}
