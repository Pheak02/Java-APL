package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class employeeHour {
    public static void main(String[] args) {
        // CREATE HASHMAP
        HashMap<String, List<Integer>> employeeWorkingHour = new HashMap<>();
        employeeWorkingHour.put("Employee 1 ", new ArrayList<>(Arrays.asList(2, 4, 3, 4, 5, 8, 8)));
        employeeWorkingHour.put("Employee 1 ", new ArrayList<>(Arrays.asList(2, 4, 3, 4, 5, 8, 8)));
        employeeWorkingHour.put("Employee 2 ", new ArrayList<>(Arrays.asList(7, 3, 4, 3, 3, 4, 4)));
        employeeWorkingHour.put("Employee 3 ", new ArrayList<>(Arrays.asList(3, 3, 4, 3, 3, 2, 2)));
        employeeWorkingHour.put("Employee 4 ", new ArrayList<>(Arrays.asList(9, 3, 4, 7, 3, 4, 1)));
        employeeWorkingHour.put("Employee 5 ", new ArrayList<>(Arrays.asList(3, 5, 4, 3, 6, 3, 8)));
        employeeWorkingHour.put("Employee 6 ", new ArrayList<>(Arrays.asList(3, 4, 4, 6, 3, 4, 4)));
        employeeWorkingHour.put("Employee 7 ", new ArrayList<>(Arrays.asList(3, 7, 4, 8, 3, 8, 4)));
        employeeWorkingHour.put("Employee 8 ", new ArrayList<>(Arrays.asList(6, 3, 5, 9, 2, 7, 9)));

        // System.out.println(" Su M T W Th F Sa");
        // print each key to separate employee in row

        for (HashMap.Entry<String, List<Integer>> entry : employeeWorkingHour.entrySet()) {
            String key = entry.getKey();
            List<Integer> values = entry.getValue();
            System.out.print(key + ": ");
            for (int value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

}
