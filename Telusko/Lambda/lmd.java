
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();
}

public class lmd {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(n -> n % 2 == 0) // filter even numbers
                .map(n -> n * n) // square them
                .forEach(System.out::println); // print

        // System.out.println("Hello from lmd!");
        // MyFunctionalInterface myFunc = () -> System.out.println("Hello from
        // Lambda!");
        // myFunc.sayHello();

    }
}