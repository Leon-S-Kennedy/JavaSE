package about_string.leetcode.p387;

import java.util.Arrays;

public class Solution {
    //思路，首先按照字符从前往后遍历字符串，统计每个字符出现的次数。然后再次按照字符从前往后遍历字符串。输出第一个为1的字符，若没有则-1
    public int firstUniqChar(String s) {
        int[] count=new int[26];
        for (char c : s.toCharArray()) {
            int i=c-'a';
             count[i]++;
        }
        int index=0;
        for (char c : s.toCharArray()) {
            int i=c-'a';
            if(count[i]==1){
                return index ;
            }
            index++;
        }
        return -1;
    }



    public static void main(String[] args) {
        String s="aabecadbb";
        Solution s1 = new Solution();
        System.out.println(s1.firstUniqChar(s));
    }
}
