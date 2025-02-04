package Class;

import java.util.*;
import java.io.*;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] s1= s.toCharArray();
        char[] t1= t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
    }
    public static void main(String[] args) {
        Anagram anagram= new Anagram();
        System.out.println(anagram.isAnagram("listen", "silent")); 
    }
}
