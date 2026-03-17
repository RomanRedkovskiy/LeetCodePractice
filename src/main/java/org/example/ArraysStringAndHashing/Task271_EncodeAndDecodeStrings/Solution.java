package org.example.ArraysStringAndHashing.Task271_EncodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder();
        for (String str : strs) {
            strBuilder.append(str).append("$");
        }
        return strBuilder.toString();
    }

    public List<String> decode(String str) {
        StringBuilder strBuilder = new StringBuilder();
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '$') {
                strs.add(strBuilder.toString());
                strBuilder.setLength(0);
            } else {
                strBuilder.append(str.charAt(i));
            }
        }
        return strs;
    }
}