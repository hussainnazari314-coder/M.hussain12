
package changecm;


public class ChangeCM {

    public static void main(String[] args) {
       
                System.out.println("Inches     Centimeters");
        System.out.println("----------------------");

        for (int inch = 1; inch <= 10; inch++) {
            double cm = inch * 2.54;
            System.out.printf("%-10d%.2f\n", inch, cm);
        }

    }
    
}
