package Class;

import java.util.*;
import java.io.*;

/* QUESTION: given an array of integers, find the sum of the largest contiguous subarray, but you must exclude 
subarrays where the sum is negative */

public class NegativeSum {
    public static void main(String[] args) {
        int[] nums={1,-1,5,-2,3};
        int target=3;   
        int result=maxSubArrayLength(nums, target);
        System.out.println("Maximum subarray length: "+result);     
    }
    public static int maxSubArrayLength(int[] nums, int target){
        HashMap<Integer, Integer> sumMap=new HashMap<>();
        int currSum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum==target){
                maxLength=i+1;
            }
            if(sumMap.containsKey(currSum-target)){
                maxLength=Math.max(maxLength,i-sumMap.get(currSum-target));
            }
            sumMap.putIfAbsent(currSum,i);
        }
        return maxLength;
    }
}
