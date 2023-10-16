import java.util.Scanner;  
  
public class factdowhi 
{  
    public static void main(String[] args) 
    {         
        int fact = 1;  
        int i = 1;   
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a number of factorial : ");  
        int num = sc.nextInt(); 
        do 
        {  
            fact = fact * i;   
            i++;   
        } 
            while( i <= num ); 
            System.out.println(" Factorial of " + num + " is: " + fact); 
            sc.close(); 
    }  
}  
