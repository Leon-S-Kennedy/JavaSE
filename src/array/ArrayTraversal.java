package array;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] a={101,102,103};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            a[i]*=2;
        }
        System.out.println("遍历结束");

        for (int e:a){//遍历a中的元素，把其值赋给e
            System.out.println(e);
        }
        System.out.println("遍历结束");

        //常见的异常1.下标越界2.空指针异常（对NULL解引用）
    }
}
