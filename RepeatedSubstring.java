package Class;

import java.util.*;
import java.io.*;

public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        //string manipulation
        String t = s + s;
        return t.substring(1, t.length() - 1).contains(s);
    }
    public static void main(String[] args) {
        RepeatedSubstring repeatedSubstring = new RepeatedSubstring();
        System.out.println(repeatedSubstring.repeatedSubstringPattern("abab")); 
    }
}
