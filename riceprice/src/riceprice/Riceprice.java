
package riceprice;
import java.util.Scanner;

public class Riceprice {

  
    public static void main(String[] args) {
        double price1 ;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the rice price for first package : ");
        price1 = input .nextDouble();
        
        double weight1 ;
        System.out.println("Enter the rice weight for first package : ");
        weight1 = input .nextDouble();
        
        double price2 ;
        System.out.println("Enter the rice price for second package : ");
        price2 = input .nextDouble();
        
        double weight2 ;
        System.out.println("Enter the rice weight for second package : ");
        weight2 = input.nextDouble();
        
        double package1 =  weight1 / price1;
        double package2 =  weight2 / price2;
        
        if (package1 > package2)
        {
            System.out.println("Package 1 has a better price.");
        }
        else if (package2 > package1)
        {
            System.out.println("Package 2 has a better price.");
        }
        else if (package2 == package1)
        {
            System.out.println("two Packages have the same price.");
        }
    }
    
}
