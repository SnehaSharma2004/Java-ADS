package Class;

import java.util.*;
import java.io.*;

public class ThreeSum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currSum)<Math.abs(target-closestSum)){
                    closestSum=currSum;
                }
                if(currSum<target){
                    left++;
                }else if(currSum>target){
                    right--;
                }else{
                    return currSum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSum.threeSumClosest(nums, target));
    }
}
