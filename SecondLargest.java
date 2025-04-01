import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5, 3, 15, 7, 4, 13, 2, 6, 17, 8, 22, 21));

        if (numbers.size() < 2) {
            System.out.println("Not enough elements");
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
