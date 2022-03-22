public class demo01 {
    public static void main(String[] args) {
        for(int n=1000;n<=2000;n++)
        if(n%100==0){
            if(n%400==0){
                System.out.println(n);
            }else{
                ;
            }
        }
        else if(n%4==0){
            System.out.println(n);
        }else{
            ;
        }
    }
}