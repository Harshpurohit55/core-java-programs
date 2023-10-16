import java.util.*;
public class fourfunction 
{
    static void min()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("minimum in function with no return and no parameter");
        if(a<b)
            System.out.println(a+" is minimum:");
        else
            System.out.println(b+" is minimum:");
    }
    static void minp(int a,int b)
    {
        System.out.println("minimum in function with no return and with parameter");
        if(a<b)
            System.out.println(a+" is minimum:");
        else
            System.out.println(b+" is minimum:");
    }
    static int minr()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number:");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
            return a;
        else
            return b; 
    }
    static int minpr(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
    
	public static void main(String[] args) 
    {
        min();
        minp(12,45);
        System.out.println("mini in function with return is :"+minr());
        System.out.println("mini in function with return and parameter is :"+minpr(45,52));
        
	}
            
}
