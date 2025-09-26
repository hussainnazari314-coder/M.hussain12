
package china;
import java.util.Scanner;
public class China {

    
    public static void main(String[] args) {
        
        int year ;
       Scanner input = new Scanner (System.in);
       System.out.println("Enter your year : ");
       year = input .nextInt();
       
       int useryear = year%12 ;
       switch (useryear) {
           case 0 : System.out.println("The year is monkey year.");
           break ;
           case 1 : System.out.println("The year is rooster year.");
           break ;
           case 2 : System.out.println("The year is dog year.");
           break ;
           case 3 : System.out.println("The year is pig year.");
           break ;
           case 4 : System.out.println("The year is rat year.");
           break ;
           case 5 : System.out.println("The year is og year.");
           break ;
           case 6 : System.out.println("The year is tiger year.");
           break ;
           case 7 : System.out.println("The year is rabbit year.");
           break ;
           case 8 : System.out.println("The year is dragon year.");
           break ;
           case 9 : System.out.println("The year is snake year.");
           break ;
           case 10 : System.out.println("The year is horse year.");
           break ;
           case 11 : System.out.println("The year is sheep year.");
           break ;
           
       }
    }
    
}
