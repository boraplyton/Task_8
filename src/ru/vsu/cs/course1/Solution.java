package ru.vsu.cs.course1;

public class Solution {
    public static int[][] test(int[][] table) {

        int maxSumColumn = -100000;
        int minSumColumn = 100000;
        int indexMaxSumColumn = 0;
        int indexMinSumColumn = 0;
        for (int i = 0; i < table[0].length; i++) {
            int currentSum = 0;
            for (int j = 0; j < table.length; j++) {
                currentSum += table[j][i];

            }
            if (currentSum >= maxSumColumn) {
                maxSumColumn = currentSum;
                indexMaxSumColumn = i;
            }
            if (currentSum < minSumColumn) {
                minSumColumn = currentSum;
                indexMinSumColumn = i;
            }
        }

        for (int i = 0; i < table.length; i++) {
            int c = table[i][indexMinSumColumn];
            table[i][indexMinSumColumn] = table[i][indexMaxSumColumn];
            table[i][indexMaxSumColumn] = c;
        }
        return table;
    }
}
