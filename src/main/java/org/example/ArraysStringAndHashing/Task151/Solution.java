package org.example.ArraysStringAndHashing.Task151;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("    world    hello    "));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> words = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!sb.isEmpty()) {
                    words.add(sb.toString());
                }
                sb.setLength(0);
            } else {
                sb.append(s.charAt(i));
            }
        }

        if (!sb.isEmpty()) {
            words.add(sb.toString());
        }

        sb.setLength(0);
        for (int i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i)).append(" ");
        }
        return sb.toString().trim();
    }

}
