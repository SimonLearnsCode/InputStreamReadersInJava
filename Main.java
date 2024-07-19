//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.io.*;
public class Main {




    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        String name;
        int rollno;
        float marks;

        System.out.println("Enter your name");

        name = obj.nextLine();

        System.out.println("Enter your rollno");

        rollno = obj.nextInt();

        System.out.println("Enter your marks");

        marks = obj.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Marks: " + marks);




    }


}


