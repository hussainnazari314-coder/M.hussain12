
package myclass;

public class Myclass {

   
    public static void main(String[] args) {
       int a = 10 ;
       int b = 20 ;
       System.out.println("the value of a " + a);
        System.out.println("the value of b " + b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a " + a);
        System.out.println("the value of b " + b);
        
    }
    
}
