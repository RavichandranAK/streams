package preparation;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 2, 10, 7);

        // Using streams, sorting with reversed() method
        Integer secondMax = numbers.stream()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the first element (max)
                .findFirst() // Get the second max
                .orElseThrow(() -> new IllegalStateException("List is too small"));

        System.out.println("Second max: " + secondMax);
    }
}
