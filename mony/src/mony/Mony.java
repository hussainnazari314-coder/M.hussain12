
package mony;
import java.util.Scanner;

public class Mony {

   
    public static void main(String[] args) {
     
        int price ;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the origenal price : ");
        price = input .nextInt();
        
        double saletax ;
        System.out.println("Enter the sale tax : ");
        saletax = input .nextDouble();
        
        double result =( price * saletax ) ;
        System.out.println(result);
     
    }
    
}
