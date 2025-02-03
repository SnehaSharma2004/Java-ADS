package Class;

import java.util.*;
import java.io.*;

public class ReverseVowels {
    public String reverseVowels(String s) {
        if(s==null||s.length()==0) return s;
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] chars=s.toCharArray();
        int left=0, right=chars.length-1;
        
        //2-pointer approach
        while(left<right){
            while((left<right)&&!vowels.contains(chars[left])){
                left++;
            }
            while((left<right)&&!vowels.contains(chars[right])){
                right--;
            }
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels("IceCreAm")); 
    }
}
