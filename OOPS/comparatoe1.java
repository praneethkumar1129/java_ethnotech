import java.util.ArrayList;

public class comparatoe1 {
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();

        students.add("Praneeth");
        students.add("Teju");
        students.add("Nivetha");
        students.add("Sam");
        students.remove(2);

        System.out.println("Students: "+students);
        System.out.println("First Student: "+students.get(0));
        students.set(1, "Ravi");
        System.out.println("After Update: "+students);
        students.remove("Nivetha");
        System.out.println("After Remove: "+students);
        if(students.contains("Teju")){
            System.out.println("Teju is Present");
        }
        System.out.println("Total Students: "+students.size());
    }
}
