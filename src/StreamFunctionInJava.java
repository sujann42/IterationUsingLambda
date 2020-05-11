import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFunctionInJava {
    public static void main(String[] args) {
        /*Mapping*/
        List<Integer> number = Arrays.asList(71, 23, 33, 45, 5, 62, 27, 88, 19);
        number.forEach(aa -> System.out.print(aa + " "));
        System.out.println();
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        square.forEach(aa -> System.out.print(aa + " "));

        /*Filter*/
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int evenSum = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println("\n" + evenSum);

        List<String> names = Arrays.asList("Reflection", "Seally", "Collection", "Stream");
        List<String> startsWithS = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        startsWithS.forEach(a -> System.out.println(a));

        List<Integer> sortedSet = number.stream().sorted().collect(Collectors.toList());
        sortedSet.forEach(sss -> System.out.print(sss + " "));
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sums = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("\nSum of numbers: " + sums);
        List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 5, 6);
        Integer sumofNums = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumofNums);
    }
}
