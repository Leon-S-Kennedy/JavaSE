package Exception.Demo;

public class demo {
    //异常对象的构造方法
    //1.无参构造异常
    public static void main(String[] args) {
        RuntimeException runtimeException = new RuntimeException();
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException("下标越界");
        RuntimeException runtimeException1 = new RuntimeException(arrayIndexOutOfBoundsException);

        //throw arrayIndexOutOfBoundsException;
        System.out.println(runtimeException.getMessage());//打印异常信息

        //打印调用栈
        runtimeException.printStackTrace();
        runtimeException.printStackTrace(System.err);
        //打印到标准输出
        runtimeException.printStackTrace(System.out);

    }
}
