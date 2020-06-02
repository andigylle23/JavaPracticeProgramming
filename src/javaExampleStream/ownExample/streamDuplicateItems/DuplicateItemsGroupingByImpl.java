package javaExampleStream.ownExample.streamDuplicateItems;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateItemsGroupingByImpl implements  IDuplicateItems {
    @Override
    public <T> Set<T> findDuplicateInStream(Stream<T> stream) {
        return stream.collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
