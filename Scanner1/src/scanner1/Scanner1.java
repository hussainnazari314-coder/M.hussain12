
package scanner1;
import java.util.Scanner;


public class Scanner1 {

   
    public static void main(String[] args) {
        String Name ;
        int Age ;
        double Average ;
        Scanner input = new Scanner (System.in);
        //note 
        System.out.print("Enter your Name : ");
        // get name 
        Name = input.nextLine();
        
        
        System.out.print("Enter your Age : ");
        Age = input.nextInt();
        
        System.out.print("Enter your Average : ");
        Average = input.nextDouble();
        
        System.out.println("Name : " + Name +"\n Age : " + Age + " \n Average" + Average);
        
        
    }
    
}
