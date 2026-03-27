package org.example.ArraysStringAndHashing.Task443;

public class Solution {

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'c'}));
    }

    public static char[] compress(char[] chars) {
        int counter = 0;
        int lastCharCounter = 0;
        char[] res = new char[chars.length];
        for (char aChar : chars) {
            if (counter > 0 && aChar == res[counter - 1]) {
                lastCharCounter++;
            } else {
                if (lastCharCounter > 1) {
                    res[counter++] = Character.forDigit(lastCharCounter, 10);
                }

                res[counter++] = aChar;
                lastCharCounter = 1;
            }
        }

        char[] ans = new char[counter];
        System.arraycopy(res, 0, ans, 0, counter);
        return ans;
    }
}
