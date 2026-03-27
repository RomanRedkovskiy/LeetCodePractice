package org.example.HashCollections.Task2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        System.out.println();
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num1 : nums1) {
            set1.add(num1);
        }

        for (int num2 : nums2) {
            set2.add(num2);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        set1.forEach(num -> {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        });

        set2.forEach(num -> {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        });

        return List.of(list1, list2);
    }
}