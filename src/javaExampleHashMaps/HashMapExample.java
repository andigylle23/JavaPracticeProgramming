package javaExampleHashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> vehicles = new HashMap<>();

        //Add vehicles
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes Benz", 5);
        vehicles.put("Audi", 3);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keyset method.
        for(String key : vehicles.keySet()) {
            System.out.println(key + " - " + vehicles.get(key));
            System.out.println();
        }

            String searchKey = "Audi";
            if (vehicles.containsKey(searchKey)) {
                System.out.println("Found the total " + vehicles.get(searchKey) + " " + searchKey + " cars! \n");
            }

            vehicles.clear();

            System.out.println("After clear operation, size: " + vehicles.size());
    }
}
