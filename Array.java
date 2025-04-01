import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(21);
        list.add(23);
        list.add(24);
        list.add(25);
        System.out.println(list.get(2));
        list.add(2, 12);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(23));
        System.out.println(list);

        list.set(1, 100);
        System.out.println(list);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Does the list contain 100? " + list.contains(100));
        System.out.println("Index of 100: " + list.indexOf(100));
        System.out.println("Last index of 100: " + list.lastIndexOf(100));
        System.out.println("Sublist from index 0 to 2: " + list.subList(0, 2));
        System.out.println("List before clearing: " + list);
        list.clear();
        System.out.println("List after clearing: " + list);
        System.out.println("Is the list empty after clearing? " + list.isEmpty());
        System.out.println("Size of the list after clearing: " + list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List after adding 1, 2, 3: " + list);
        System.out.println("Size of the list after adding 1, 2, 3: " + list.size());
        System.out.println("Is the list empty after adding 1, 2, 3? " + list.isEmpty());
        System.out.println("Does the list contain 2? " + list.contains(2));
        System.out.println("Index of 2: " + list.indexOf(2));
        System.out.println("Last index of 2: " + list.lastIndexOf(2));
    }
}
