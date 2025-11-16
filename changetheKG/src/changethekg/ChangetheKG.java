
package changethekg;


public class ChangetheKG {

    
    public static void main(String[] args) {
      
        System.out.println("Kilograms    Pounds");
        System.out.println("-------------------");

        for (int kg = 1; kg <= 200; kg++) {
            double pounds = kg * 2.2;
            System.out.printf("%-12d%.1f\n", kg, pounds);
        }
    }

    }
    

