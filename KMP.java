package Class;

import java.util.*;
import java.io.*;

public class KMP {
    //KMP ALGORITHM (leetcode 214)

    public String shortestPalindrome(String s) {
        if (s==null || s.length()==0){
            return s;
        }
        String t=s+"#"+new StringBuilder(s).reverse().toString();
        int[] lps=clps(t);
        int palLen=lps[t.length()-1];
        String rem=s.substring(palLen);
        String prefix=new StringBuilder(rem).reverse().toString();
        return prefix+s;
    }
    private static int[] clps(String s){
        int n=s.length();
        int[] lps=new int[n];
        int j=0;
        for(int i=1;i<n;i++){
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j=lps[j-1]; //backtracking

            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        KMP kmp = new KMP();
        System.out.println(kmp.shortestPalindrome("aacecaaa")); 
    }
}
