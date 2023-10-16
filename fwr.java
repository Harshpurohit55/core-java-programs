import java.util.*;
public class fwr 
{
    static int add(int x,int y)
    {
        return x+y;

    }
    public static void main(String[] args)
    {
        int x,y;
        System.out.println("Enter 2 numbers :");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int res=add(x,y);
        System.out.println(res);
        
        
       



    }
    
}
