import java.util.*;
public class addfunc2 
{
    static void add(int a,int b)
    {
        System.out.println("Addition is: "+(a+b));
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        add(a,b);
        sc.close();
    }
    
}
