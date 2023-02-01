package PracticePractice.CollinsHM8;

import java.util.*;

public class Arrayzero {


    private static int countTwoSum(int[] numbers) {
        int count = 0;
        int front = 0, rear = numbers.length - 1;

        while (front < rear) {
            if (numbers[front] + numbers[rear] == 0) {
                front++;
                rear--;
                count++;
            } else {
                if (Math.abs(numbers[front]) > Math.abs(numbers[rear])) {
                    front++;
                } else {
                    rear--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 8, 11,15, -1, -3, -7, -8, -11, -15};
        Arrays.sort(numbers);
        System.out.println(countTwoSum(numbers));
    }
}