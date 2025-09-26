
package lottery;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
   
      
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int num = input .nextInt();
        
        int number = (int) (Math.random() * 10);
         int number2 = (int) (Math.random() * 10);
        if (num == (number+number2))
        {
            System.out.println("You won 10000$");
        }
        else  if (num == number || num == number2 )
        {
            System.out.println("You won 1000$");
        }
        else if ( num == (number+number2) || num == (number2+number))
        {
            System.out.println("You won 3000$");
        }
        else
        {
          System.out.println("Wrong the number is : " + number + number2);
        }
    }
    
}
