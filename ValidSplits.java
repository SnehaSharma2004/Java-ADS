package Class;

import java.util.*;
import java.io.*;

public class ValidSplits {
    public int waysToSplitArray(int[] nums) {
        //to run all test-cases, declare totalSum, leftSum and rightSum in long
        long totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        long leftSum=0;
        int validSplit=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            long rightSum=totalSum-leftSum;
            if(leftSum>=rightSum){
                validSplit++;
            }
        }
        return validSplit;
    }
    public static void main(String[] args){
        ValidSplits v = new ValidSplits();
        int[] nums = {10,4,-8,7};
        System.out.println(v.waysToSplitArray(nums));
    }
}
