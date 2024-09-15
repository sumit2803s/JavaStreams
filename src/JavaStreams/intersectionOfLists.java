package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class intersectionOfLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10, 5, 3, 1);
        List<Integer> intersection=list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(intersection);
    }

}
