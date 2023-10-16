import java.util.*;
public class subfucn2 
{
    static void sub(int a,int b)
    {
        System.out.println("Subtaction is: "+(a-b));
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        sub(a,b);
        sc.close();
    }
    
}