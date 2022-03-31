package practice;

public class getBinaryOne {
    public static void getOne(int n){
        int count=0;
        for(int i =0;i<32;i++){
            if(((n>>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }
public static void getOne2(int n){
        int count=0;
        while(n!=0){
            count++;
            n&=(n-1);
        }
    System.out.println(count);
}
    public static void main(String[] args) {
        getOne(-1);
        getOne2(-1);
    }
}
