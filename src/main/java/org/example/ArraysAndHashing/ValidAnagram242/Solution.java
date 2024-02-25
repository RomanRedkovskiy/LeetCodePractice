package org.example.ArraysAndHashing.ValidAnagram242;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "naagram"));
    }

    /* Method 1: sorting (takes a lot of memory)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
     */

    /* Method 2: intuitive way, but slowest one, also takes decent amount of memory
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char sChar: s.toCharArray()) {
            map.put(sChar, map.getOrDefault(sChar, 0) + 1);
        }
        for (char tChar: t.toCharArray()) {
            map.put(tChar, map.getOrDefault(tChar, 0) - 1);
        }
        for (int value: map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
     */
    //Method 3: best method. Array length is eng alphabet
    //1 string increases every arr element (letter)
    //2 string decreases every arr element (letter)
    // if every element is not 0, string aren't anagrams
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }
        for(int value: letters){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
