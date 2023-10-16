import java.util.*;
public class factobj 
{
    void fact()
    {
        int n,i,res=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            res=res*i;
        }
        System.out.println("Factorial is :" +res);

    }
    public static void main(String[] args) 
    {
        factobj  m1= new factobj();
        m1.fact();
        factobj m2= new factobj();
        m2.fact();
    }
}
