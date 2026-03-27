package org.example.SlidingWindow.Task1456;

import java.util.Set;

class Solution {

    public static void main(String[] args) {
        System.out.println(maxVowels("", 4));
    }

    public static int maxVowels(String s, int k) {
        int currentVowels = 0;
        int maxVowels = 0;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
        }

        maxVowels = currentVowels;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                currentVowels--;
            }
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
            }
        }

        return maxVowels;
    }
}