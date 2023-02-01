package PracticePractice.Collins12;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintUniqueCharactersMap {
    public static void main(String[] args) {
        String str = "aabccctyuoopdeeeef";
        System.out.println("uniqueChars(str) = " + uniqueChars(str));
    }
    public static Map<String,Integer> uniqueChars(String str){
        String[] arr = str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();

        for (String each : arr){
            int frequency= Collections.frequency(Arrays.asList(arr), each);
            if(frequency==1){
                result.put(each,1);
            }
        }
        return result;
    }


}
