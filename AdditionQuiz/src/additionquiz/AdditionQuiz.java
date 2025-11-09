
package additionquiz;
import java.util.Scanner;

public class AdditionQuiz {

    
    public static void main(String[] args) {
   
                int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = input.nextInt();

        if (answer == num1 + num2) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong. " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }

    }
    

