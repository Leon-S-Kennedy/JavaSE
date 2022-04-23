package about_string.leetcode.p125;
public class Solution {
    public boolean isABC(char c){
        if(c>='0'&&c<='9'){
            return true;
        }
        return c>='a'&&c<='z';
    }
    public boolean isPalindrome(String s) {
        char[] c =s.toLowerCase().toCharArray();
        char[] c2=new char[c.length];
        int k=0;
        for (char c1 : c) {
            if(isABC(c1)){
               c2[k++]=c1;
            }
        }
        int i=0;
        int j=k-1;
        while(i<j){
            if(c2[i]!=c2[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    private static boolean isnumABC(char c){
        if(c>='0'&&c<='9'){
            return true;
        }else return c >= 'a' && c <= 'z';
    }
    public boolean isPalindrome01(String s){
        char[] chars = s.toLowerCase().toCharArray();
        char[] ch = new char[chars.length];
        int j=0;
        for (char aChar : chars) {
            if (isnumABC(aChar)) {
                ch[j++] = aChar;
            }
        }
        for (int i = 0; i < j; i++) {
            if (ch[i]!=ch[--j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome01(s));
    }
}
