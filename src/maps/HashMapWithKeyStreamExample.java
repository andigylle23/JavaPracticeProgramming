package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class HashMapWithKeyStreamExample {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<>();
        
        map.put("one", "first");
        map.put("two", "second");
        map.put("three", "third");
        map.put("forth", "forth");

        // Iterating keys
        Stream<String> streamKeys = map.keySet().stream();
        // Iterating values
        Stream<String> steamValues = map.values().stream();
        // Change the first line
        steamValues.forEach((value) -> {
            System.out.println(value);
        });

        // Iterating values
        Iterator<String> iterator = map.values().iterator();
        while(iterator.hasNext()){
            String nextValue = iterator.next();
            System.out.println(nextValue);
        }
    }
}
