package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anna", "Xono", "Bent", "Ali");
        list.stream()
                .filter(s -> !s.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        list = list.stream().sorted().collect(Collectors.toList());

        System.out.println(list);

    }
}
