import java.util.*;

class si 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amonut: ");
        int p = sc.nextInt();
        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();
        System.out.print("Enter number of years: ");
        float n = sc.nextFloat();
        System.out.println("simple interest is " + ((p * r * n) / 100));
    }
}
