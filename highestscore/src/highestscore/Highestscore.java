
package highestscore;
import java.util.Scanner;

public class Highestscore {

    
    public static void main(String[] args) {
      
                Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String bestStudent = "";
        double bestScore = 0.0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();

            System.out.print("Enter student score: ");
            double score = input.nextDouble();

            if (score > bestScore) {
                bestScore = score;
                bestStudent = name;
            }
        }

        System.out.println("Top student is " + bestStudent + " with a score of " + bestScore);
    

    }
    
}
