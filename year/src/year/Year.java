
package year;
import java.util.Scanner;

public class Year {

   
    public static void main(String[] args) {
       /*
        in this code i show you since 1970 how many
        hours
        minute
        and second
        passed.
        */
       int year ;
       double hour ;
       double minute ;
       double second ;
       
       Scanner Input = new Scanner (System.in);
       System.out.print("Enter the year : ");
       year =Input .nextInt() ;
        
       hour =(((2025-year)*365)+(((2025-year)/4d)+256))*(24);
       minute=hour*60;
       second=minute*60l;
       
       System.out.println("Since " + year + " passed " + hour + " hour." );
       System.out.println("Since " + year + " passed " + minute + " minute.");
       System.out.println("Since " + year + " passed " + second + " second.");
       
    }
    
}
