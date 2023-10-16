import java.util.*;

public class swapping
{
    public static void main(String[] args)
    {
        System.out.println("Enter 2 number: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping value is: " +a+ " " +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping value is: " +a+ " " +b);
        sc.close();
    }
    
    
}