import java.util.*;
public class marks
{
    public static void main(String[] args)
    {
        System.out.print("Enter your Marks: ");
        Scanner sc = new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        float per = ((m1+m2+m3)/3);

        if(per<50){
            System.out.println("Fail");
        }
         else if(per>=50 && per<60)
        {
            System.out.println("C Grade");
        }
        else if(per>=60 && per<70){
            System.out.println("B Grade");
        }
        else if(per>=70 && per<80){
            System.out.println("A Grade");
        }
        else if(per>=80 && per<100)
        {
            System.out.println("A+ Grade");
        }
        else{
            System.out.println("Invalid");
        }
        
        sc.close();
        
    }
}
