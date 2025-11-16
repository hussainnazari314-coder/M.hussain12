
package financial;


public class Financial {

  
    public static void main(String[] args) {
     
                double tuition = 10000;  // شهریه فعلی
        double rate = 0.06;      // نرخ افزایش سالانه

        // محاسبه شهریه در سال دهم
        for (int year = 1; year <= 10; year++) {
            tuition = tuition * (1 + rate);
        }

        System.out.printf("Tuition after 10 years: $%.2f\n", tuition);

        // حالا ۴ سال بعد از سال دهم را حساب می‌کنیم
        double totalCost = 0;
        double tuitionAfter10 = tuition;

        for (int i = 1; i <= 4; i++) {
            tuitionAfter10 = tuitionAfter10 * (1 + rate);
            totalCost += tuitionAfter10;
        }

        System.out.printf("Total cost for 4 years after the 10th year: $%.2f\n", totalCost);
    }

    }
    

