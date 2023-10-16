import java.util.*;
public class vote
{
	public static void main(String[] args) 
    {
	System.out.println("Enter your age: ");
	Scanner sc = new Scanner(System.in);
    int age=sc.nextInt();
    if(age>18)
    {  
        System.out.print("you are  eligible for vote");
    }
    else
    {
         System.out.print("you are not eligible for vote");
    }
	
	}
}
 
