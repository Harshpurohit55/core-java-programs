import java.util.Scanner;

public class factfunc2 {
    
    public static int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
          
            int factorialResult = calculateFactorial(number);
            
            
            System.out.println("The factorial of " + number + " is: " + factorialResult);
        }

        
        scanner.close();
    }
}

