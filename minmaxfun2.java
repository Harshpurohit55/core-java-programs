import java.util.*;
public class minmaxfun2 
{
    
        static int max(int a,int b)
        {
            System.out.println("Enter two numbers");
            
            if(a>b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }
        public static void main(String args[])
        {
           int a,b;
           Scanner sc=new Scanner(System.in);
           a=sc.nextInt();
            b=sc.nextInt();

            
         //int res=max();
         System.out.println("maximum is" max);
        }
    }