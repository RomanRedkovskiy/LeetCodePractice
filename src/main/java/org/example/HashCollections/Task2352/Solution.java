package org.example.HashCollections.Task2352;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        System.out.println();
    }

    public static int equalPairs(int[][] grid) {
        boolean isEqual;
        int counter = 0;
        for (int i = 0; i < grid.length; i++) { // i-ая колонка, которую сравниваем
            for (int j = 0; j < grid.length; j++) { // j-ая строчка, с которой сравниваем
                isEqual = true;
                for (int k = 0; k < grid.length; k++) { // k-ое значение в строчке/колонке, который сравниваем
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    counter++;
                }
            }
        }
        return counter;
    }
}