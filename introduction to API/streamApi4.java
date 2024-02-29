// Stream Api in java

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class streamApi4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 6, 5, 6, 7, 9);

        Stream<Integer> streamData = list.stream();

        streamData.forEach(n -> System.out.println(n));

        // streamData.forEach(n -> System.out.println(n));
    }
}
