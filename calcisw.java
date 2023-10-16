import java.util.*;

public class calcisw 
{
    public static void main(String[] args)
    {
    System.out.print(" Choose an operater: +, -, * or /  ");
    Scanner input=new Scanner(System.in);
    char operater;
    Double number1, number2, result;
    operater = input.next().charAt(0);

    System.out.println("Enter first number: ");
    number1 = input.nextDouble();

    System.out.println("Enter Second number: ");
    number2 = input.nextDouble();

    switch(operater)
    {
        case '+':
            result= number1 + number2;
            System.out.print(number1 + "+" + number2 + "=" + result);
            break;
        
        case '-':
            result= number1 - number2;
            System.out.print(number1 + "-" + number2 + "=" + result);
            break;

        case '*':
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
            break;

        case '/':
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
            break;
        
        default:
            System.out.println("Invalid operator!");
            break;
    }

            input.close();
            

    }

    
    
}
