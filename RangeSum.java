package Class;

import java.util.*;
import java.io.*;

public class RangeSum {
    static class NumArray {
        int[] prefixSum;
        public NumArray(int[] nums) {
            prefixSum = new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                prefixSum[i+1]=prefixSum[i]+nums[i];
            }
        }
        
        public int sumRange(int left, int right) {
            return prefixSum[right+1]-prefixSum[left];
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(1, 3)); 
    }
}
