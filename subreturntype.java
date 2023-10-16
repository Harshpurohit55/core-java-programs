
public class subreturntype 
{
   static int sub() 
   { 
      int x = 70;
      int y = 30;
      int z = x-y;
      return z;
   }
   public static void main(String args[]) 
   {
    
      int sub = sub();
      System.out.println("The sum of x and y is: " + sub);
   }
}
