package PracticePractice.CollinsHM8;

public class ArrayPermutationCombinations {
    public static void permute(char[] intArray, int start) {
        for (int i = start; i < intArray.length; i++) {
            char temp = intArray[start];
            intArray[start] = intArray[i];
            intArray[i] = temp;
            permute(intArray, start + 1);
            intArray[i] = intArray[start];
            intArray[start] = temp;
        }
        if (start == intArray.length - 1) {
            System.out.println(java.util.Arrays.toString(intArray));
        }
    }

    public static void main(String[] args) {
        char intArr[] = {'a', 'b', 'c'};
        permute(intArr, 0);
    }
}