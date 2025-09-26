
package leapyear;
import java.util.Scanner;

public class Leapyear {

    
    public static void main(String[] args) {
        
        int year ; 
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the year : ");
        year = input .nextInt();
        
        if (year % 4 == 0   &&  year % 100 != 0 ||  year % 400 == 0)
        {
            System.out.println("this year is leap .");
        }
        else System.out.println("this year is not leap .");
    }
    
}
