
package pointposition;
import java.util.Scanner;

public class Pointposition {

  
    public static void main(String[] args) {
      
        double p0 , x0 , y0;
        double p1 , x1 , y1;
        double p2 , x2 , y2 ;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter three points for p0 p1 p2 : ");
        x0 = input .nextDouble(); y0 = input .nextDouble();
        x1 = input .nextDouble(); y1 = input .nextDouble();
        x2 = input .nextDouble(); y2 = input .nextDouble();
        
        double resultp2 = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if (resultp2>0)
        {
            System.out.println("p2 is on the left side of the line.");
        }
          if (resultp2<0)
        {
            System.out.println("p2 is on the right side of the line.");
        }
            if (resultp2==0)
        {
            System.out.println("p2 is on the same line.");
        }
    }
    
}
