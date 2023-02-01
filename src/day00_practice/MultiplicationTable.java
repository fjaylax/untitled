package day00_practice;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] numbers = new int [9][9];

        for (int i = 1; i <= 9; i++ ) {
            for (int j = 1 ; j <= 9; j++ ) {
                numbers[i-1][j-1] = i * j;
            }
        }

        System.out.println(Arrays.deepToString(numbers));
        System.out.println();

        for (int i = 1; i <= 9; i++ ) {
            for (int j = 1 ; j <= 9; j++ ) {
                if (numbers[i-1][j-1] <= 9) {
                    System.out.print(numbers[i-1][j-1] + "   ");
                } else
                    System.out.print(numbers[i-1][j-1] + "  ");
            }
            System.out.println();
        }
    }
}
