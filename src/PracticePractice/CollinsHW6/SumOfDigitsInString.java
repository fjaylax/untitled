package PracticePractice.CollinsHW6;

public class SumOfDigitsInString {


    public static void main(String[] args) {
        System.out.println(sumOfDigits("223455ttt6666"));
    }

    public static String sumOfDigits(String digits) {
        int sum = 0;
        int sum22 = 0;
        for (char each : digits.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        return Integer.toString(sum);

    }

}












/*

Description. The parseInt function converts its first argument to a string, parses that string, then returns an integer or NaN . If not NaN , the return value will be the integer that is the first argument taken as a number in the specified radix

The main purpose of using the parseInt function is to extract a number from a string. This turns the returned value to an actual number. In the example above, 3 is a string and not an actual number.


 */