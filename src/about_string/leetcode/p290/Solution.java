package about_string.leetcode.p290;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String f(String[] strings) {
        int[] array = new int[strings.length];
        int k = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[0].equals(strings[i])) {
                array[i] = 0;
            } else {
                array[i] = 937854328;
            }
        }
        for (int i = 1; i < strings.length; i++) {
            if (array[i] == 937854328) {
                k++;
            }
            for (int j = i; j < strings.length; j++) {
                if (array[j] == 937854328) {
                    if (strings[i].equals(strings[j])) {
                        array[j] = k;
                    } else {
                        array[j] = 937854328;
                    }
                }
            }
        }
        return Arrays.toString(array);
    }
    public boolean wordPattern(String pattern, String s) {
        return f(pattern.split("")).equals(f(s.split(" ")));
    }
    public static void main(String[] args) {
        String s1="aabbaa";
        String s2="aa aa bb bb cc aa aa bb aa ff bb ee ee cc aa";
        Solution solution = new Solution();
        System.out.println(solution.f(s2.split(" ")));
        System.out.println(solution.f(s1.split("")));

    }
}
