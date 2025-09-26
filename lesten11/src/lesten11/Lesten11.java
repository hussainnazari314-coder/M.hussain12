
package lesten11;
import java.util.Scanner;

public class Lesten11 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
       int number1 = (int) (Math.random()* 100 );
       int number2 = (int) (Math.random()* 100 );
         int userresult;
         int result ;
         if(number1>=number2){
       System.out.println("What is the result of these numers ? \n( " + number1 +  " - " +  number2 + " )");
         }
       userresult = input .nextInt();
      result = number1 - number2 ;
       if ( result == userresult)
       {
       System.out.println("Well");
       }
       else System.out.println("It is not tru.");
         
    }
    
}
