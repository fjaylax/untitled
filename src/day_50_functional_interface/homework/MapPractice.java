package day_50_functional_interface.homework;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {


    public static void main(String[] args) {


        Map<String, Double> myMap = new HashMap<>();

        myMap.put("Jones", 100000.0);
        myMap.put("Lance", 120000.0);
        myMap.put("Nadya", 140000.0);
        myMap.put("Kirill", 110000.0);
        myMap.put("John D", 190000.0);

        System.out.println(myMap);

        double maxSalary = 0, minSalary = 1000000000000.;
        String maxSalName = "", minSalName = "";
        int emloyeeCount = 0;

        for (String key : myMap.keySet()) {

            double currentEmployeeSal = myMap.get(key);

            if (currentEmployeeSal > maxSalary ) {
                maxSalary = currentEmployeeSal;
                maxSalName = key;
            }

            if (currentEmployeeSal < minSalary ) {
                minSalary = currentEmployeeSal;
                minSalName = key;
            }

            if (currentEmployeeSal >= 120000 && currentEmployeeSal <= 150000 ) {
                emloyeeCount ++;
            }

            if (currentEmployeeSal <= 118000) {
                System.out.println("Employee " + key + " has the salary less then 180000 " + currentEmployeeSal);
            }

            myMap.put(key, currentEmployeeSal + 10000);
        }

        System.out.println("Minimum salary has " + minSalName + " equal " + minSalary);

        System.out.println("Maximum salary has " + maxSalName + " equal " + maxSalary);

        System.out.println("emloyeeCount = " + emloyeeCount);

        System.out.println(myMap);

    }


}
