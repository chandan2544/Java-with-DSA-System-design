// chaining of streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamApi5 {
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(8,4,2,7,5);

        Stream<Integer> streamData=list.stream();
                                       
        // Stream<Integer> fileData=streamData.filter(n->n%2==0);

        // Stream<Integer> sortedStream=fileData.sorted();

        // Stream<Integer> mapStream=sortedStream.map(n->n*2);

        // mapStream.forEach(n->System.out.println(n));

        Stream<Integer> finalStream = streamData.filter(n -> n % 2 == 0)
        .sorted()
        .map(n->n*2);

        finalStream.forEach(n -> System.out.println(n));
    }
}
