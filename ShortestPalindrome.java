package Class;

import java.util.*;
import java.io.*;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        int i = 0;
        int n = s.length();
        for (int j = 0; j < n; j++) {
            if (s.charAt(i) == s.charAt(n - j - 1)) {
                i++;
            }
        } 
        if (i == n) {
            return s;
        }
        String p = new StringBuilder(s.substring(i, n)).reverse().toString();
        return p + shortestPalindrome(s.substring(0, i)) + s.substring(i);
    }
    public static void main(String[] args) {
        ShortestPalindrome sp = new ShortestPalindrome();
        System.out.println(sp.shortestPalindrome("aacecaaa")); // 
    }
}
