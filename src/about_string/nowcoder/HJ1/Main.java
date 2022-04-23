package about_string.nowcoder.HJ1;

import java.util.Scanner;

class Solution{
    public int LengthOfLastWorld(String s){
        //用来实现
        return s.length()-1-s.lastIndexOf(" ");
    }
    public int LengthOfLastWorld02(String s){
        int i = s.lastIndexOf(" ");
        String substring = s.substring(i + 1);
        return substring.length();
    }
    public int LengthOfLastWorld03(String s){
        String[] split = s.split(" ");
        return split[split.length - 1].length();
    }


}
public class Main {

    public static void main(String[] args) {
        //专心处理输入输出

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Solution solution = new Solution();
        int length = solution.LengthOfLastWorld(s);
        System.out.println(length);
    }
}
