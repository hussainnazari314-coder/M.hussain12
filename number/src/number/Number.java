
package number;
import java.util.Scanner;
public class Number {

   
    public static void main(String[] args) {
      
        int n ;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number : ");
        n = input .nextInt();
        
        if (n%5==0 && n%6==0)        
        {
            System.out.println("this number is divisible by 5 and 6 ");
        }
        
        else if (n%5==0  ||  n%6==0)  
        {
            if (n%5==0 ){
            System.out.println("this number is divisible by 5 ");
            }
             if (n%6==0 ){
            System.out.println("this number is divisible by 6 ");
            }
        }
        
        else if (n%5==0  ^  n%6==0)  
        { 
              if (n%5==0 ){
            System.out.println("this number is divisible by 5 ");
            }
             if (n%6==0 ){
            System.out.println("this number is divisible by 6 ");
            }
        }
        
            }
    
}
