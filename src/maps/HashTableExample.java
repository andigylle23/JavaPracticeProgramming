package maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {

        Map<String, Integer> vehicles = new Hashtable<>();

        // Add vehicles
        vehicles.put("BMW",5);
        vehicles.put("Audi",5);
        vehicles.put("Ford",5);
        vehicles.put("Mercedes",5);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for(String key: vehicles.keySet()) {
            System.out.println(key + " - " + vehicles.get(key));
        }

        // Search for the keyword and return the data found
        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey)) {
            System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
        }

        // clear all values
        vehicles.clear();

        System.out.print("After clear operation, size: " + vehicles.size());
        // The next statements throw a NullPointerException, if uncommented.
        // vehicles.put("Nissan", null);
        // vehicles.put(null, 6);
    }
}
