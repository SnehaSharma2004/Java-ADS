package Class;

import java.util.*;
import java.io.*;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum==totalSum-leftSum-nums[i]){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        PivotIndex pivotIndexObj = new PivotIndex();
        int[] arr={1,7,3,6,5,6};
        int result=pivotIndexObj.pivotIndex(arr);
        System.out.println(result);
    }
}
