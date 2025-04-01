import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println(numbers);
    }
}
