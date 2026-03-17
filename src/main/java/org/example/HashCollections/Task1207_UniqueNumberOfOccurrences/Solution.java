package org.example.HashCollections.Task1207_UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numbersOccurrences = new HashMap<>();
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int j : arr) {
            numbersOccurrences.merge(j, 1, Integer::sum);
        }
        return new HashSet<>(numbersOccurrences.values()).size() == numbersOccurrences.size();
    }
}
