
package highestscore2;
import java.util.Scanner;

public class Highestscore2 {

   
    public static void main(String[] args) {
    
                Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String highestName = "";
        double highestScore = 0.0;

        String secondName = "";
        double secondHighestScore = 0.0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();

            System.out.print("Enter student score: ");
            double score = input.nextDouble();

            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondName = highestName;

                highestScore = score;
                highestName = name;
            } 
            else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondName = name;
            }
        }

        System.out.println("Highest score: " + highestName + " (" + highestScore + ")");
        System.out.println("Second highest: " + secondName + " (" + secondHighestScore + ")");
    }
}

    
    

