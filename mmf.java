import java.util.*;
public class mmf 
{
    static int CompareNum(int x, int y)   
    {   
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }
    public static void main(String[] args)
    {
        int x,y;
        System.out.println("Enter 2 numbers :");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int res=CompareNum(x,y);
        System.out.println("Maximum no is :"+res);
      
    }
    
}
