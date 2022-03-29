package array;

import java.util.Arrays;

public class ArrayCopyOf {
    public static long[] copyofRange(long[] src,int newlength,int fromindex ,int toindex){
        long[] dest=new long[newlength];
        for(int i=0;i< Math.min(Math.min(newlength, src.length-fromindex),toindex-fromindex+1);i++){
            dest[i]=src[i+fromindex];
        }
        return dest;
    }
    public static void main(String[] args) {
        long[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(copyofRange(array, 12,3,15)));
    }
}
