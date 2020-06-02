package javaExampleStream.ownExample.streamDuplicateItems;

import java.util.Set;
import java.util.stream.Stream;

public interface IDuplicateItems {
    public <T> Set<T> findDuplicateInStream(Stream<T> stream);
}
