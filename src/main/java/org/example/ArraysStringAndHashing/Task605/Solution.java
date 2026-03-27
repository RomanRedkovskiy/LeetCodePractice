package org.example.ArraysStringAndHashing.Task605;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> containingVowels = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                containingVowels.add(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (counter < containingVowels.size() && s.charAt(i) == containingVowels.get(counter)) {
                sb.append(containingVowels.get(containingVowels.size() - 1 - counter));
                counter++;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
