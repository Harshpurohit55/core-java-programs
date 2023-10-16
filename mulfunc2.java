import java.util.*;
public class mulfunc2 
{
    static void Multi(int a,int b)
    {
        System.out.println("Multiplication is: "+(a*b));
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Multi(a,b);
        sc.close();
    }
    
}
