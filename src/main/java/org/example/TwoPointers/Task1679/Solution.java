package org.example.TwoPointers.Task1679;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{}, 3));
    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> requiredNumbersForOperation = new HashMap<>();
        int counter = 0;
        Integer numberOfOccurrences;
        for (int num : nums) {
            numberOfOccurrences = requiredNumbersForOperation.get(num);
            if (numberOfOccurrences != null) {
                counter++;
                if (numberOfOccurrences > 1) {
                    requiredNumbersForOperation.put(num, numberOfOccurrences - 1);
                } else {
                    requiredNumbersForOperation.remove(num);
                }
            } else if (num < k) {
                requiredNumbersForOperation.merge(k - num, 1, Integer::sum);
            }
        }
        return counter;
    }
}