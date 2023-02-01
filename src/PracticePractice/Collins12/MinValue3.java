package PracticePractice.Collins12;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinValue3 {
    public static void main(String[] args) {
        Map<String, Integer> employees = new LinkedHashMap<>();
        employees.put("Alen",1250000);
        employees.put("Gani",135000);
        employees.put("Kylysh",155000);
        employees.put("Malika",145000);
        employees.put("Jay",160000);
        employees.put("Shirin",110_000);
        System.out.println("minValue(employees) = "+

                minValue(employees));



}
    public static Map<String,Integer> minValue(Map<String,Integer>map1){
        int min = Integer.MAX_VALUE;
        String minKey = "";
        Map<String,Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> eachResult : map1.entrySet()) {
            if(eachResult.getValue() < min){
                min=eachResult.getValue();
                minKey =eachResult.getKey();

            }
        }
        result.put(minKey,min);
        return result;

    }

}
