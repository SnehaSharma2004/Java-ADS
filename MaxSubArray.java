package Class;

import java.util.*;
import java.io.*;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        //via greedy
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num,currentSum+num);
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        MaxSubArray maxSubArrayObj = new MaxSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result=maxSubArrayObj.maxSubArray(nums);
        System.out.println(result);
    }
}
