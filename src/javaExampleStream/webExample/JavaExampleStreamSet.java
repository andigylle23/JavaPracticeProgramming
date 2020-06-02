package javaExampleStream.webExample;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Sample program for Stream that finds duplication using Set
public class JavaExampleStreamSet {

    public static void main(String[] args) {
        // Initial stream
        // Add string data's
        Stream<String> stream = Stream.of("This", "That", "Those", "This", "This", "These");

        // The findDuplicateInStream function will store the stream(initial data) items to Set<T> items
        // Using the stream.filter, it will then filter all items received, then if found duplicates the it will add to Collectors.toSet()
        // Collectors.toSet() will return all added elements into a new Set
        System.out.println(findDuplicateInStream(stream));
    }

    // Function that uses Collectors to Set to find the duplicate data that's being provided
    public static <T> Set<T> findDuplicateInStream(Stream<T> stream) {
        // Store the duplicates
        Set<T> items = new HashSet<>();

        //Return the set of duplicate elements
        // Collectors to Set() guarantees type, mutability, serializability or thread safety of the Set return
        return stream.filter(n -> !items.add(n)).collect(Collectors.toSet());
    }
}
