package Class;

import java.util.*;
import java.io.*;

//Given an array containing both positive and negative integers, find the length of the largest subarray with sum 0.

public class largestSubarray {

    //BRUTE FORCS

    /*static int maxLen(int arr[], int n) {
        int maxLength = 0;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                // If sum becomes 0, update max length
                if (sum == 0) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        System.out.println("Largest subarray length with sum 0: " + maxLen(arr, n));
    }*/

    //HASHMAP

    static int maxLen(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If sum is 0, update maxLength
            if (sum == 0) {
                maxLength = i + 1;
            }

            // If sum is already in the map, update maxLength
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // Store the first occurrence of the sum
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        System.out.println("Largest subarray length with sum 0: " + maxLen(arr, n));
    }
}
