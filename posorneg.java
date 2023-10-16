import java.util.*;
public class posorneg 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a number: ");
		int num= sc.nextInt();
		 if (num<0)
         {
		 System.out.println(num+ " is a Negative number");
         }
		 else
         {
		 System.out.println(num+ " is a positive number");
         }
            sc.close();
    }
        
    
}
