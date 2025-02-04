package Class;

import java.util.*;
import java.io.*;

public class BasicCalculator {
    int i=0;
    public int calculate(String s) {
           return calc(s);
    }
    private int calc(String s) {
        int num = 0, ans = 0;
        int sign = 1;
       while (i<s.length()) {
            char ch = s.charAt(i++);
           if (ch>='0' && ch<='9') {
                num = num*10+ch-'0';
            } else if (ch=='(') {
               num = calc(s);
            } else if (ch==')') {
                return ans+=num*sign;
           } else if (ch=='+' || ch=='-') {
                ans+=num*sign;
                num = 0;
                sign = (ch=='-')?-1:1;
            }
        }
        ans+=num*sign;
        return ans;
   }
   public static void main(String[] args) {
    BasicCalculator calculator = new BasicCalculator();
    System.out.println(calculator.calculate("1+1")); 
   }
}
