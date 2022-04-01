package practice;

public class narcissus {
    public static void printdigtal2(int m) {
        int n=m;
        int result =0;
        while (m > 0) {
            result+=Math.pow((m % 10),3);
            m /= 10;
        }
        if(n==result){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            printdigtal2(i);
        }
    }
}
