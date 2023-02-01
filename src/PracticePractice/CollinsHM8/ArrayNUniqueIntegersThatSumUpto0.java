package PracticePractice.CollinsHM8;

import java.util.Arrays;

public class ArrayNUniqueIntegersThatSumUpto0 {


    private static int countThreeSum(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            int front = 0, rear = numbers.length - 1;

            while (front < rear) {
                if (numbers[front] + numbers[rear] + numbers[i] == 0) {
                    System.out.printf(String.format("Front : {%d}  Rear : {%d}  I : {%d}  \n", numbers[front],
                            numbers[rear], numbers[i]));
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
        }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 12, 16, 19, 15, 11, 8, -1, -3, -7, -8, -11, -17, -15};
        Arrays.sort(numbers);
        System.out.println(countThreeSum(numbers));
    }
}
