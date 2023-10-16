import java.util.*;
public class fournumbers 
{
    public static void main (String[] args)
    {
        System.out.print("Enter Four Numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a>b && a>c && a>d)
        
            System.out.println(a+" is Greater. ");

        else if (b>a && b>c && b>d)

            System.out.println(b+" is Greater. ");
        
        else if (c>a && c>b && c>d)

            System.out.println(c+" is Greater. ");

        else

        System.out.println(d+" is Greater. ");

        sc.close();
    }
    
}
