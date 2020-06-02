package javaExampleStream.webExample;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Sample program for Stream that finds duplication using grouping by
public class JavaExampleStreamGroupingBy {

    public static void main(String[] args) {
        // Initial stream
        // Add string data's
        Stream<String> stream = Stream.of("This", "That", "Those", "This", "This", "These");

        // The findDuplicateInStream function will store the stream(initial data) items to Set<T> items
        // Using the Collectors.groupingBy() it will add all elements and its frequency in a map
        // Then using Collectors to Set, it will return the duplicate values
        System.out.println(findDuplicateInStream(stream));
    }

    // Function to find the duplicate in the stream
    public static <T> Set<T> findDuplicateInStream(Stream<T> stream) {
        return stream.collect(
                // Each element in the stream will be group according to their frequency in a map using Collectors.groupingBy()
                // For each frequency that is collected in the map, if the frequency of any element is more than one
                // It means the element is duplicated
                Collectors.groupingBy(Function.identity(), Collectors.counting()))
                // Convert the map to stream
                .entrySet().stream()
                // Check the frequency of the stored elements
                .filter(m -> m.getValue() > 1)
                // Then find elements
                .map(Map.Entry::getKey)
                // Finally collect them in a set
                .collect(Collectors.toSet());
    }
}
