package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new TreeMap<>();

        // Add vehicles
        vehicles.put("BMW", 4);
        vehicles.put("Mercedes Benz", 2);
        vehicles.put("Audi", 19);
        vehicles.put("Ford", 4);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for(String key : vehicles.keySet()) {
            System.out.println(key + " - " + vehicles.get(key));
        }

        System.out.println("Highest Key: " + ((TreeMap)vehicles).lastKey());
        System.out.println("Lowest Key: " + ((TreeMap)vehicles).firstEntry());

        System.out.println("Printing all values");

        for(Integer val: vehicles.values()) {
            System.out.println(val);
        }

        // clear all values
        vehicles.clear();

        // Equals to zero
        System.out.println("After clear operation is: " + vehicles.size());
    }
}
