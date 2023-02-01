package PracticePractice.Collins12;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters11 {
    public static void main(String[] args) {
        String str = "bbccctagag";
        System.out.println("freqOfChars(str) = " + freqOfChars(str));

    }
    public static Map<String,Integer> freqOfChars(String str){

        String[] arr = str.split("");
        //Collections.frequency()
        Map<String, Integer> result = new LinkedHashMap<>(); //{b=2.c=3.g=5}

        for (String each :arr) { // each: characters of string
            result.put(each, Collections.frequency(Arrays.asList(arr),each));
        }
        return result;
    }
}
