import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private float[] marks = new float[3];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        System.out.println("Enter marks in 3 subjects: ");
        for(int i=0; i<3; i++) {
            marks[i] = sc.nextFloat();
        }
    }

    void display() {
        float total = 0;
        for(int i=0; i<3; i++) total += marks[i];
        float percentage = total / 3;

        System.out.println("\n--- Report Card ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if(percentage >= 60) System.out.println("Grade: First Division");
        else if(percentage >= 45) System.out.println("Grade: Second Division");
        else System.out.println("Grade: Fail");
    }
}

public class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        Student[] students = new Student[n];

        // input data
        for(int i=0; i<n; i++) {
            System.out.println("\nEnter details for Student " + (i+1) + ":");
            students[i] = new Student();
            students[i].input();
        }

        // display report cards
        for(int i=0; i<n; i++) {
            students[i].display();
        }
    }
}
