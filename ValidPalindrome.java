package Class;

import java.util.*;
import java.io.*;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //step 1: remove all the spaces and alphanumeric characters
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        //step 2: initialize to pointers
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama")); 
    }
}
