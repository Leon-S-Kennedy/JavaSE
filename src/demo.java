public class demo {
    public static void main(String[] args) {
        //使用Type.parseType("String")将字符串类型转换成为其他类型
        byte b=Byte.parseByte("1");
        short s=Short.parseShort("1");
        int i= Integer.parseInt("1");
        long l=Long.parseLong("1");
        float f=Float.parseFloat("1");
        double d=Double.parseDouble("1");
        boolean bl=Boolean.parseBoolean("1");

        //使用String。valueof(type)将其他的类型转换成为字符串类型
        String str1=String.valueOf(1);
        String str2=String.valueOf(1L);
        String str3=String.valueOf(1.);
        String str4=String.valueOf(1.F);

        int i1=Integer.parseInt("10",2 );
        System.out.println(i1);
    }
}
