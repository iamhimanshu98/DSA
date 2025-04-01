
import java.util.ArrayList;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();

        str.add("One");
        str.add("two");
        str.add("three");
        str.add("four");
        str.add("five");

        System.out.println(str.get(3));

        str.addAll(5, str);
        
        str.addAll(Arrays.asList("hundred", "two hundred"));

        System.out.println(str);
    }
}
