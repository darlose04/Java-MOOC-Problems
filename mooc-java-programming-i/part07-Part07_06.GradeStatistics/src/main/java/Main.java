
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());
            
            if (grade == -1) {
                break;
            }
            
            grades.addGrade(grade);
        }
        
//        grades.printGrades();
        System.out.println("Point average (all): " + grades.gradeAvg());
        System.out.println("Point average (passing): " + grades.passingAvg());
    }
}
