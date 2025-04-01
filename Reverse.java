import java.util.ArrayList;
import java.util.Arrays;;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 2, 5, 6, 3, 8));

        System.out.println("Before swap: " + numbers);
        if (numbers.size() < 2) {
            System.out.println("Not enough size");
        } else {
            for (int i = 0; i < numbers.size() / 2; i++) {
                int first = numbers.get(i);
                int last = numbers.get(numbers.size() - 1 - i);
                numbers.set(i, last);
                numbers.set(numbers.size() - 1 - i, first);
            }

            System.out.println("After swap: " + numbers);
        }
    }
}
