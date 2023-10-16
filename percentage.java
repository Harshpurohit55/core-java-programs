import java.util.*;
public class percentage
{
    
        public static void main(String[] args)
        {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String str= sc.nextLine();
        System.out.print("pls enter 3 Subject marks: ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        float per= ((m1+m2+m3)/3);
        System.out.println(str+ "Your Percentage is" +per);
        sc.close();



        }

}