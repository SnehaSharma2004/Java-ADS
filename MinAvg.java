package Class;

import java.util.*;
import java.io.*;

public class MinAvg {
    public int minimumAverageDifference(int[] nums) {
        int len = nums.length, res = 0;
        long min = Integer.MAX_VALUE, sum = 0, leftSum = 0, rightSum = 0;
        for (int num : nums)
            sum += num;
        for (int i = 0; i < len; i++) {
            leftSum += nums[i];
            rightSum = sum - leftSum;
            long diff = Math.abs(leftSum / (i + 1) - (len - i == 1 ? 0 : rightSum / (len - i - 1)));
            if (diff < min) {
                min = diff;
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        MinAvg minAvg = new MinAvg();
        int[] nums = {2,5,3,9,5,3};
        System.out.println(minAvg.minimumAverageDifference(nums));
    }
}
