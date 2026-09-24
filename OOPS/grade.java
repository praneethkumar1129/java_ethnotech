import java.util.*;
public class grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks");
        int marks = sc.nextInt();

        if(marks>90){
            System.out.println("5Star");
        }
        else if(marks>80){
            System.out.println("4Star");
        }
        else if(marks>70){
            System.out.println("3Star");
        }
        else{
            System.out.println("AVG Student");
        }
    }
}