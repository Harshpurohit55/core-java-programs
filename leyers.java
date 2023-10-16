import java.util.*;
public class leyers 
{
    public static void main(String[] args) 
    {
	System.out.println("Enter the Year: ");
	Scanner sc = new Scanner(System.in);
    int year=sc.nextInt();
    if(year % 4 == 0)
    {  
        System.out.print("Leap Year");
    }
    else
    {
         System.out.print("Not a Leap Year");
    }
	
	}
}
