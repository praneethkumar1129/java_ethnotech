import java.util.HashMap;
import java.util.Map;

public class main{
    public static void main(String[] args){
        HashMap<Integer,String> students = new HashMap<>();

        students.put(103, "Praneeth");
        students.put(101, "Teju");
        students.put(102, "Sam");
        students.put(104, "Nivetha");

        System.out.println("Map: " + students);
        System.out.println("Student 102: " + students.get(102));
        System.out.println("Size:" + students.size());
        System.out.println("Contains Key 103:" + students.containsKey(103));
        System.out.println("Contains Value Sam:" + students.containsValue("Sam"));
        students.put(102, "Kajal");
        System.out.println("After Updating: " + students);
        students.remove(104);
        System.out.println("After Removing 104: " + students);
        System.out.println("\nUsing keyset():");
        for(Integer key : students.keySet()){
            System.out.println(key + " -> " + students.get(key));
        }
        System.out.println("\nUsing entryset:");
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}