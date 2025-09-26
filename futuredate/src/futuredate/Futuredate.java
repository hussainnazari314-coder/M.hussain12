
package futuredate;
import java.util.Scanner;

public class Futuredate {

   
    public static void main(String[] args) {
        
     int todayday;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter today’s day :");
        todayday = input .nextInt();
        
        int fday ;
        System.out.println("Enter the number of days elapsed since today: ");
        fday = input .nextInt();
        
        switch (todayday)
        {
            case 0 : System.out.print("today is friday");
            break ;
            case 1 : System.out.print("today is saturday");
            break ;
            case 2 : System.out.print("today is sunday");
            break ;
            case 3 : System.out.print("today is monday");
            break ;
            case 4 : System.out.print("today is tuesday");
            break ;
            case 5 : System.out.print("today is wednesday");
            break ;
            case 6 : System.out.print("today is thursday");
            break ;
            
        }
               
        switch (fday%7)
        {
            case 0 : System.out.print(" and the future day is friday");
            break ;
            case 1 : System.out.print(" and the future day is saturday");
            break ;
            case 2 : System.out.print(" and the future day is sunday");
            break ;
            case 3 : System.out.print(" and the future day is monday");
            break ;
            case 4 : System.out.print(" and the future day is tuesday");
            break ;
            case 5 : System.out.print(" and the future day is wednesday");
            break ;
            case 6 : System.out.print(" and the future day is thursday");
            break ;
            
        }
    }
    
}
