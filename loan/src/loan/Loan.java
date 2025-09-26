
package loan;

import java.util.Scanner;

public class Loan {

    
    public static void main(String[] args) {
           double Monthlypayment ;
        double loanamount ;
        double Monthlyinterestrate ;
        double numberofyear ;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the loanamount : ");
        loanamount = input .nextDouble();
        
        System.out.println("Please enter the Monthly interest rate : ");
        Monthlyinterestrate = input .nextDouble();
        
        System.out.println("Please enter the number of year : ");
        numberofyear = input .nextDouble();
        
        Monthlypayment = (loanamount*Monthlyinterestrate)/(1-(1/((1+Monthlyinterestrate)^(numberofyear*12)));
                }
    
}
