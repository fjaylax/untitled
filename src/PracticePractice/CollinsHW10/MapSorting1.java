package PracticePractice.CollinsHW10;

import java.util.*;

public class MapSorting1 {
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {

        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }


    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("q", 98);
        hm.put("w", 85);
        hm.put("g", 91);
        hm.put("e", 95);
        hm.put("r", 79);
        hm.put("t", 80);
        Map<String, Integer> hm1 = sortByValue(hm);


        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
// 3. Map -- Sort the map by values
//     Write a method that can sort the Map by values

