import java.util.*;
import java.io.*;

public class Leetcode340 {
    public static int longestkSubstr(String s, int k) {
        
        //LONGEST SUBSTRING WITH AT MOST K DISTINCT CHARACTERS
        
        //given a string s and an integer k
        //find length of longest sub-string 
        //that contains atmost k distinct characters
        
        //input s="eceba" k=2
        //output=3
        //sliding window and hashmap
        
        if(s==null||s.length()==0||k==0) return -1;
        Map<Character, Integer> map=new HashMap<>();
        int le=0, maxLen=-1;
        for(int ri=0;ri<s.length();ri++){
            char c=s.charAt(ri);
            map.put(c, map.getOrDefault(c, 0)+1);
            
            while(map.size()>k){
                char leftChar=s.charAt(le);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                le++;
            }
            if(map.size()==k){
                maxLen=Math.max(maxLen, ri-le+1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="eceba";
        int k=2;
        System.out.println(longestkSubstr(s,k));
    }
}
