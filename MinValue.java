package Class;

import java.util.*;
import java.io.*;

public class MinValue {
    
        public int minStartValue(int[] nums) {
            int cumulativeSum=0;
            int sum=0;
            for(int num:nums){
                cumulativeSum+=num;
                if(cumulativeSum<sum){
                    sum=cumulativeSum;
                }
            }
            return sum < 0 ? 1 - sum : 1;
        }
    
    public static void main(String[] args){
        MinValue solution = new MinValue();
        int[] nums = {-3,2,-3,4,2};
        System.out.println(solution.minStartValue(nums));
    }
}
