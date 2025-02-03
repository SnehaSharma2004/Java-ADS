package Class;

import java.util.*;
import java.io.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate.containsDuplicate(nums)); 
    }
}
