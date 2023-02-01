package PracticePractice.Collins12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MInValueMap1 {
    public static void main(String args[]) throws Exception
    {

        // Creating hashMap
        Map<String, Integer> map
                = new HashMap<String, Integer>();

        // Putting key-value pairs in map
        map.put("A", 10);
        map.put("B", 15);
        map.put("C", 20);
        map.put("D", 55);

        // Print the map
        System.out.println("Map: " + map);

        // getting minimum value using min()
        int minValue = Collections.min(map.values());

        // getting maximum value using max()
        int maxValue = Collections.max(map.values());

        // printing the minimum value
        System.out.println("Minimum Value of Map is: "
                + minValue);

        // printing the maximum value
        System.out.println("Maximum Value of Map is: "
                + maxValue);
    }

}
