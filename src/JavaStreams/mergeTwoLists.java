package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeTwoLists {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2=Arrays.asList(2, 4, 6, 8, 9,6, 10);
        List<Integer> mergedlists= Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(mergedlists);
    }
}
