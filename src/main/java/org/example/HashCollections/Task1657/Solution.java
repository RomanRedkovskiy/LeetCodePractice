package org.example.HashCollections.Task1657;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
        System.out.println(closeStrings("cabbba", "abbccc"));
    }

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> occurrenceMap1 = new HashMap<>();
        Map<Character, Integer> occurrenceMap2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            occurrenceMap1.merge(word1.charAt(i), 1, Integer::sum);
            occurrenceMap2.merge(word2.charAt(i), 1, Integer::sum);
        }

        return occurrenceMap1.keySet().equals(occurrenceMap2.keySet()) &&
                occurrenceMap1.values().stream().sorted().toList()
                        .equals(occurrenceMap2.values().stream().sorted().toList());
    }
}