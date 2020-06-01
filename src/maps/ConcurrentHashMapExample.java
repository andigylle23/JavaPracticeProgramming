package maps;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new ConcurrentHashMap<>();

        // Add some values
        vehicles.put("Toyota", 3);
        vehicles.put("BMW", 2);
        vehicles.put("Ford", 20);
        vehicles.put("Mercedez Benz", 19);

        // Print out all added vehicles
        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all the vehicles, using the keyset method
        for(String key: vehicles.keySet()) {
            System.out.println(key + " - " + vehicles.get(key));
        }

        // Set the search to a specific car
        String searchKey = "Ford";
        if(vehicles.containsKey(searchKey)) {
            System.out.println("Found total: " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap) vehicles).elements();
        while(elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }

        Integer val = (Integer) vehicles.putIfAbsent("Ford", 9);
        if(val != null) {
            System.out.println("Audi was found in the map and the value has been updated!");
        }

        val = (Integer) vehicles.putIfAbsent("Nissan", 10);
        if(val != null) {
            System.out.println("Nissan wasn't found in the map, so will create a new pair. The map data is updated!");
        }

        // Clear all values
        vehicles.clear();

        // Equals to zero
        System.out.println("After clear operation, size: " + vehicles.size());

    }
}
