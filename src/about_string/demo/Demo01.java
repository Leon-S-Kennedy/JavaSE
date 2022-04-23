package about_string.demo;

import java.io.UnsupportedEncodingException;

public class Demo01 {
    public static void main(String[] args) {
        byte[] b={0x7e,(byte)0xa2,0x69,0x7c,0x68,(byte) 0xa6};
        String s= null;
        try {
            s = new String(b,0,b.length,"unicode");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(s);

    }
}
