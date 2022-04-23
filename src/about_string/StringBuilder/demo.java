package about_string.StringBuilder;

public class demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
        String s=sb.toString();
        System.out.println(s);
    }
}
