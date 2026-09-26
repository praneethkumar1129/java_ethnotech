package LinkedHashSet;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Set: " + numbers);
        numbers.remove(40);
        System.out.println("After Removing 40: " + numbers);
        numbers.add(50);
        System.out.println("After Adding 50: " + numbers);
        System.out.println("\nIteration:");
        for(Integer number : numbers){
            System.out.println(number);
        }
        System.out.println("\nIs Empty: " + numbers.isEmpty());
        numbers.clear();
    }

}
