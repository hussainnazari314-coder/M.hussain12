
package cramerrule;
import java.util.Scanner;
public class Cramerrule {

   
    public static void main(String[] args) {
    
        double a , b , c , d , e , f ;
        double x , y ;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        a = input .nextInt();
        b = input .nextInt();
        c = input .nextInt();
        d = input .nextInt();
        e = input .nextInt();
        f = input .nextInt();
        x = ((e*d) -(b*f))/((a*d)-(b*c));
        y = ((a*f) -(e*c))/((a*d)-(b*c));
        
         if (  ((a*d)-(b*c)) != 0 )
             {
             System.out.println("x is " +x+ " and y is " +y);
             }
             if (  ((a*d)-(b*c)) == 0 )
             {
                 System.out.println("The equation has no solution");
             }
    }
    
}
