package about_string.demo;

public class Demo04 {
/*
    public static void main(String[] args) {
        split(12);
    }
    public static int split(int num){
        if(num>1){
            System.out.println(split1(6));
        }
        return num;
    }

    private static int split1(int num) {
        if(num>1){
            System.out.println(split2(3));
        }
        return num;

    }

    private static int split2(int num) {
        if(num>1){
            if(num%2!=0){
                System.out.println(split4(2));
            }
            System.out.println(split3(1));
        }
        return num;

    }

    private static int split4(int num) {
        if(num>1){
            System.out.println(split5(1));
        }
        return num;

    }

    private static int split5(int num) {
        return num;
    }

    private static int split3(int num) {
        return num;
    }
*/

    public static void main(String[] args) {
        split(12);
    }
    public static int split(int num){
        if(num>1){
            if(num%2!=0){
                System.out.println(split((num++)/2)*2);
            }
            System.out.println(split(--num/2));
        }
        return num+1;
    }
}
