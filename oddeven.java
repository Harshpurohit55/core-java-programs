import java.util.*;

public class oddeven 
{
    public static void main(String[] args)
    {
        System.out.print(" Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a % 2 == 0)
        {  
            System.out.print("No is Even");
        }
        else
        {
             System.out.print("No is odd");
        }
            sc.close();
    }
    
}
