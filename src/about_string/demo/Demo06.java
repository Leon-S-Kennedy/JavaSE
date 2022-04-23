package about_string.demo;

public class Demo06 {
    public static void main(String[] args) {
        String s="hello world";

        System.out.println(s.lastIndexOf("h"));
        System.out.println(s.lastIndexOf("o",s.length()-5));


        int count=0;
        int from=0;
        while (true){
            int i=s.indexOf("o",from);
            if(i < 0){
                break;
            }
            count++;
            from=i+1;
        }
        System.out.println(count);
    }
}
