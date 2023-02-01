package PracticePractice.Collins12;

import java.util.Arrays;

public class Reverseeachword {


    public static String main(String[] args) {
        String str = "Today is Friday. Have a good weekend!";

        // reverse: yadoy si .yadirF evah a doog !dnekeew

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isLetter(str.charAt(i)) || Character.isSpaceChar(str.charAt(i))) {
                reverse += str.charAt(i);
            }
        }
        return reverse;
    }
}

