import java.util.*;
public class Min
{
	public static void main(String[] args) 
    {
	System.out.println("Enter 1st number: ");
	Scanner sc = new Scanner(System.in);
    int no1=sc.nextInt();
    System.out.println("Enter 2nd number: ");
    int no2=sc.nextInt();
    if(no1>=no2){  
        System.out.print(no1 +" is greater.");
    }
    else
    {
         System.out.print(no2 +" is greater.");
    }
	
	}
}
