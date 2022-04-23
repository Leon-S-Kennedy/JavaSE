package about_string.replace;

public class demo {
    public static void main(String[] args) {
        String s="hello World";
        System.out.println(s.replace("o", "x"));//全部替换
        System.out.println(s.replace("ll", "x"));//全部替换
        System.out.println(s.replaceAll("ll", "xx"));//全部替换
        System.out.println(s.replaceAll(".", "x"));//.在正则表达式中表示全部
        System.out.println(s.replaceFirst(".", "x"));// 只替换第一个//.在正则表达式中表示全部

    }
}
