package javaExampleStream.ownExample.streamDuplicateItems;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateItemsSetImpl implements IDuplicateItems {

    @Override
    public <T> Set<T> findDuplicateInStream(Stream<T> stream) {
        Set<T> items = new HashSet<>();
        return stream.filter(
                n -> !items.add(n))
                .collect(Collectors.toSet());
    }
}
