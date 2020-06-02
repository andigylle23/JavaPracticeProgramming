package javaExampleStream.webExample;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class JavaExampleStreamFrequency {
    public static void main(String[] args) {
        // Initial stream
        // Add string data's
        List<String> list = Arrays.asList("This", "That", "Those", "This", "This", "These");

        // The findDuplicateInStream function will store the list(initial data) items to Set<T> items
        // Using the Collections.frequency it will traverse all the elements and its frequency in collection list
        // Then using Collectors to Set, it will return the duplicate values that's been collected
        System.out.println(findDuplicateInStream(list));
    }

    // Function to find the duplicate in the stream
    public static <T> Set<T> findDuplicateInStream(List<T> list) {

        // Return that duplicates
        return list.stream()
                // Using the lambda expression, count the frequency of the collected items and if its greater than 1
                .filter(i -> Collections.frequency(list, i) > 1)
                // Add it to Collect(Collectors.toSet()) in a set
                .collect(Collectors.toSet());
    }
}
