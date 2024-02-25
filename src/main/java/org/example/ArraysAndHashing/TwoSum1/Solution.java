package org.example.ArraysAndHashing.TwoSum1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] ans = twoSum(new int[] {3, 2, 4}, 6);
    }

    // Adding to map <value, pos>
    // Then checking map keys for target - arr[i]
    // if there's a key = target - arr[i], return value of this key and i
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Short> options = new HashMap<>();
        for (short i = 0; i < nums.length; i++) {
            if(options.containsKey(target - nums[i])){
                return new int[] {options.get(target - nums[i]), i};
            }
            options.put(nums[i], i);
        }
        return null;
    }
}
