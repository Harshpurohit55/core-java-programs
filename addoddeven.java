import java.util.Scanner;

public class addoddeven {
    
    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

  
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

       
        checkOddEven(number1);

        
        checkOddEven(number2);

        
        int sum = add(number1, number2);

        
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        scanner.close();
    }
}
