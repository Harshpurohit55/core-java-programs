import java.util.Scanner;


public class function {
    static void Addition()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition is : " +(a+b));
       
    }

    static void Subtraction()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Subtraction is : " +(a-b));
       
    }

    static void Multliplication()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Multliplication is : " +(a*b));
        
    }

    static void Division()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Division is : " +(a/b));
        
    }
    public static void main(String[] args)
    {
        Addition();
        Subtraction();
        Multliplication();
        Division();
        
    }
                
    
}
