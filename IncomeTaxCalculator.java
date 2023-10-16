import java.util.Scanner;

public class IncomeTaxCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        
        double tax = calculateIncomeTax(income);

        
        System.out.println("Income Tax to be paid: $" + tax);

        scanner.close();
    }

    public static double calculateIncomeTax(double income) 
    {
        double tax = 0;

        if (income <= 60000) 
        {
            
            tax = income * 0.10;
        } 
        else if (income <= 150000) 
        {
            
            tax = 50000 * 0.10 + (income - 50000) * 0.20;
        }
         else 
        {
            
            tax = 50000 * 0.10 + 50000 * 0.20 + (income - 100000) * 0.30;
        }

        return tax;
    }
}
