
package body;
import java.util.Scanner;

public class Body {

  
    public static void main(String[] args) {
   double weight ;
   double height;
   double BMI ;
   Scanner input = new Scanner (System.in);
   System.out.println("Enter your weight : ");
   weight = input .nextDouble();
   
   System.out.println("Enter your height : ");
   height = input .nextDouble();
   
   BMI = weight/(height*height) ;
   
   if (BMI < 18.5 )                  System.out.println("you are underweight ");
   if (BMI  >= 18.5 && BMI < 25.0 )  System.out.println("you are normal ");
   if (BMI >= 25.0  && BMI < 30.0)   System.out.println("you are ovwerweight");
   if (BMI >= 30.0 )                 System.out.println("you are obese");
   
   else 
   {
       System.out.println("invalid result");
   }
           }
    
}
