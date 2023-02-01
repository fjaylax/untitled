package PracticePractice.CollinsHW5;

import java.util.Arrays;

public class SortAlphanumeric {
    public static void main(String[] args) {
/*
Given alphanumeric String, we need to split the string into substrings
of consecutive letters or numbers, sort the individual string and
append them back together
 */

            String input = "DCOGT501Y0012GCCCA098911RUBT";
            String output = "";
            boolean nowLetter;

            boolean isSubGroupLetters = Character.isLetter(input.charAt(0));
            String charSubGroup = input.substring(0, 1);


            for (int i = 1; i < input.length(); i++) {
                char chr = input.charAt(i);
                nowLetter = Character.isLetter(chr);

                if ((nowLetter && isSubGroupLetters) || (!nowLetter && !isSubGroupLetters )) {
                    charSubGroup = charSubGroup.concat("" + chr);//a+b==a.concat(b)
                } else {
                    output += sortString(charSubGroup);
                    charSubGroup = "" + chr;
                    isSubGroupLetters = !isSubGroupLetters;
                }
            }
            output = output.concat(sortString(charSubGroup));

            System.out.println(output);
        }

        public static String sortString(String inputString) {

            char arr[] = inputString.toCharArray(); //  {o,a,k,d}
            Arrays.sort(arr);                       //   {a,d,k,o}

            return   new String(arr);               //    "adko"
        }



    }
