package Class;

import java.util.*;
import java.io.*;

public class SumAbsolute {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixSum = new int[n];

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int leftSum = (i > 0) ? prefixSum[i - 1] : 0;
            int rightSum = prefixSum[n - 1] - prefixSum[i];

            int leftPart = nums[i] * i - leftSum;
            int rightPart = rightSum - nums[i] * (n - i - 1);

            result[i] = leftPart + rightPart;
        }

        return result;
    }
    public static void main(String[] args) {
        SumAbsolute sumAbsolute = new SumAbsolute();
        int[] nums = {2, 3, 5};
        int[] result = sumAbsolute.getSumAbsoluteDifferences(nums);
        System.out.println(Arrays.toString(result));
    }
}
