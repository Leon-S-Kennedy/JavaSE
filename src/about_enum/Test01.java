package about_enum;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(div(10, 2) ? "成功" : "失败");
        System.out.println(div(10, 0) ? "成功" : "失败");
        System.out.println("==============================");
        System.out.println(divide(10, 2) == Result.SUCCESS ? "成功" : "失败");
        System.out.println(divide(10, 0) == Result.SUCCESS ? "成功" : "失败");
    }

    public static boolean div(int a,int b){
        try{
            int c=a/b;
            return true;
        }catch (Exception exc){
            return false;
        }
    }
    public static Result divide(int a,int b){
        try{
            int c=a/b;
            return Result.SUCCESS;
        }catch (Exception exc){
            return Result.FAIL;
        }

    }
}

//枚举在编译后也是class文件
//枚举也是一种引用数据类型
//枚举中的值可以看作常量
enum Result{
    SUCCESS,FAIL
}
