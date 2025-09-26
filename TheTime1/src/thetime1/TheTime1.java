
package thetime1;

import java.util.Scanner;

public class TheTime1 {

   
    public static void main(String[] args) {
        
         String country ;
        Scanner Input = new Scanner (System.in);
        
        System.out.println("Enter the Country : ");
      
        country = Input .nextLine();
         
        long Mili_Second = System.currentTimeMillis();
        long Total_Second = Mili_Second/1000;
        long currentsecond = Total_Second%60;
        long Total_Minute = Total_Second/60;
        long currentminute = Total_Minute%60;
        long Total_Hour = Total_Minute/60;
        long currenthour = Total_Hour%24;
     
               
       
              if (country.equals("Afg")) 
              {
                  System.out.println((currenthour + 4) +":" +( currentminute + 30 ) + ":" + currentsecond );
              }
           
                if (country.equals("Iran")) 
              {
                  System.out.println((currenthour + 3) +":" +( currentminute + 30 ) + ":" + currentsecond );
              }
            
                if (country.equals("USA")) 
              {
                  System.out.println((currenthour + 4) +":" +( currentminute  ) + ":" + currentsecond );
              }
            
                if (country.equals("Pakistan")) 
              {
                  System.out.println((currenthour + 5) +":" +( currentminute  ) + ":" + currentsecond );
              }
                             
            
        
    }
    
}

