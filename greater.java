import java.util.*;
public class greater 
{
    public static void main(String[] args)
    {
        System.out.print("Enter Three Numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
        
            System.out.println(a+" is Greater. ");

        else if (b>a && b>c)

            System.out.println(b+" is Greater. ");
        
        else

            System.out.println(c+" is Greater. ");


            sc.close();

        

    }
    
}
