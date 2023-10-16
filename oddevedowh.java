import java.util.*;
public class oddevedowh 
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Print all even number until:\n");
        int num=sc.nextInt();
        System.out.println("even number from i to "+num+" are: \n");
        i=1;
        do
        {         
            if(i%2==0)
                {
                    System.out.println(i);
                 }
                i++;
        }
        while(i<=num);
        sc.close();
  }
}

