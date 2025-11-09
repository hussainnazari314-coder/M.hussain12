
package addthreenumbers;
import java.util.Scanner;

public class AddThreeNumbers {

   
    public static void main(String[] args) {
      
                int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

       
        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");
        int answer = input.nextInt();

      
        if (answer == num1 + num2 + num3) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong. " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
        }
    }

    }
    

