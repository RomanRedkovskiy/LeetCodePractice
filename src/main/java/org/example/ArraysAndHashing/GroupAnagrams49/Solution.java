package org.example.ArraysAndHashing.GroupAnagrams49;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, LinkedList<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            //It checks if the key is present in the anagramsMap.
            // If it's present, it returns the corresponding value associated with the key.
            // If the key is not present, it computes a new value using the mappingFunction
            // and puts it into the map with the specified key.
            // In this case, the mappingFunction is a lambda expression k -> new LinkedList<>(),
            // which creates a new LinkedList if the key is not present.
            anagramsMap.computeIfAbsent(anagramKey(str), k -> new LinkedList<>()).add(str);
        }
        return new LinkedList<>(anagramsMap.values());
    }

    //String like 0,0,0,0,1,0,0,0,0,1,0,0,2,1,0,0 etc
    public static String anagramKey(String s) {
        int[] anagramArray = new int[26];
        for (Character character: s.toCharArray()) {
            anagramArray[character - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int value: anagramArray){
            sb.append(value).append(',');
        }
        return sb.toString();
    }
}
