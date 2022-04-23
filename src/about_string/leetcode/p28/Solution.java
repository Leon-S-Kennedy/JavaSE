package about_string.leetcode.p28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }else if(!haystack.contains(needle)){
            return -1;
        }else {
            String[] split = haystack.split(needle);
            if(split.length==0){
                return 0;
            }
            return split[0].length();
        }
    }

    public static void main(String[] args) {
        String s1="aaaaa";
        String s2="";
        Solution solution = new Solution();
        System.out.println(solution.strStr(s1, s2));
    }
}
