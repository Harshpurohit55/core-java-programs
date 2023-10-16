import java.util.*;
public class whilsical 
{
    public static void main(String[] args)
    {
        float a,b,res=0;
        int choice;
        Scanner scan=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice (1-5): ");
            choice=scan.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("Enter any two numbers: ");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a+b;
                break;

                case 2:
                System.out.println("Enter any two numbers: ");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a-b;
                break;

                case 3:
                System.out.println("Enter any two numbers: ");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a*b;
                break;

                case 4:
                System.out.println("Enter any two numbers: ");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a/b;
                break;

                case 5:
                return;
                default:

                System.out.println("Invalid Choice!");
                break;
                
            }
                System.out.println("Result= "+res+ "");
                
                
        }   
                    
    }
}
