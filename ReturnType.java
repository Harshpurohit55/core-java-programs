public class ReturnType 
{
   static int add() 
   { 
      int x = 30;
      int y = 70;
      int z = x+y;
      return z;
   }
   public static void main(String args[]) 
   {
      int add = add();
      System.out.println("The sum of x and y is: " + add);
   }
}