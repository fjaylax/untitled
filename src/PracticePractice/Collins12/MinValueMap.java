package PracticePractice.Collins12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class MinValueMap {



    public static void main(String args[]) throws Exception
    {

        // Creating hashMap
        Map<String, Integer> map
                = new HashMap<String, Integer>();

        // Putting key-value pairs in map
        map.put("A", 10);
        map.put("B", 15);
        map.put("C", 20);
        map.put("D", 25);

        // Print the map
        System.out.println("Map: " + map);

        // getting minimum value using min()
        String minKey = Collections.min(map.keySet());

        // getting maximum value using max()
        String maxKey = Collections.max(map.keySet());

        // printing the minimum value
        System.out.println("Minimum Key of Map is: "
                + minKey);
        System.out.println("Value corresponding to "
                + "minimum Key of Map is: "
                + map.get(minKey));

        // printing the maximum value
        System.out.println("Maximum Key of Map is: " + maxKey);
        System.out.println("Value corresponding to "
                + "maximum Key of Map is: "
                + map.get(maxKey));
    }
}

