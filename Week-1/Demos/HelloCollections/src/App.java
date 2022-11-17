import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,Collections!");
        // Lists ordered means of storing objects
        // Covariance - when you use a child implementation in place of the parent
        List<Integer> someRandomNumbers = new LinkedList<Integer>();
        someRandomNumbers.add(0);
        someRandomNumbers.add(2);
        someRandomNumbers.add(3);
        someRandomNumbers.add(1);
        System.out.print("List: ");
        for (Integer integer : someRandomNumbers) {
            System.out.print(integer);
        }
        // System.out.println(someRandomNumbers.get(2));
        System.out.println();
        System.out.print("Set: ");
        Set<Character> someRandomNumbers2 = new HashSet<Character>();
        someRandomNumbers2.add('a');
        someRandomNumbers2.add('A');
        someRandomNumbers2.add('m');
        someRandomNumbers2.add('e');
        for (Character integer : someRandomNumbers2) {
            System.out.print(integer);
        }

        Queue<String> fruits = new ArrayDeque<>();
        fruits.add("kiwi");
        fruits.add("durian");
        fruits.add("mango no sugar");
        fruits.add("lychee");
        fruits.add("nectarines");
        fruits.add("jackfruit");
        fruits.add("snozz berry");
        fruits.add("star fruit");
        fruits.add("tamarind");
        fruits.add("strawberry");

        System.out.println(fruits.remove());
        System.out.println(fruits.remove());
        System.out.println(fruits.remove());
    }
}
