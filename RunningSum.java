package Class;

import java.util.*;
import java.io.*;

public class RunningSum {
    public static int[] runningSum(int[] nums){
        int[] result=new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]+nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] result=runningSum(arr);
        System.out.println(Arrays.toString(result));
    }
}
