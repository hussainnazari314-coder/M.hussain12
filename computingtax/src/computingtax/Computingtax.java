
package computingtax;
import java.util.Scanner;

public class Computingtax {

 
    public static void main(String[] args) {
        
     String filing ;
     
     double salary ;
     
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your filing : ");
        filing = input .nextLine();
        
        System.out.println("Enter your salary : ");
        salary = input .nextDouble();
        
        double taxrates = 1;
        if (salary >=0 && salary<=8350 && (filing.equals("single") || filing.equals("Married filing separately")) 
                || salary >=0 && salary<=16700 && filing.equals("Married filing jointly") || salary >=0 && salary<=11950 && filing.equals("Head of Household") )
        {
            System.out.println("your salary after tax rate is : " + salary*0.90);
        }
        else if ( salary >=8351 && salary<=33950 && (filing.equals("single") || filing.equals("Married filing separately")) 
                || salary >=16701 && salary<=67900 && filing.equals("Married filing jointly") || salary >=11951 && salary<=45500 && filing.equals("Head of Household") )
        {
            System.out.println("your salary after tax rate is : " + salary*0.85);
        }
            else if ( salary >=33951 && salary<=82250 && (filing.equals("single") || filing.equals("Married filing separately")) 
                || salary >=67901 && salary<=137050 && filing.equals("Married filing jointly") || salary >=45501 && salary<=117450 && filing.equals("Head of Household") )
        {
            System.out.println("your salary after tax rate is : " + salary*0.75);
        }   
    }
    
}
