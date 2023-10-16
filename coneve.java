import java.util.Scanner;
public class coneve 
{

    int n, i, p = 1;

    Scanner sc = new Scanner(System.in);

    coneve() {

        System.out.print("Enter a number:");
        n = sc.nextInt();
    }

    void check() {

        if (n % 2 == 0) 
        {
            System.out.println("Number is even :" + n);
        } 
        else 
        {
            System.out.println("Number is odd :" + n);
        }

    }
}

class Main 
{

    public static void main(String args[]) 
    {

        coneve obj = new coneve();
        obj.check();

    }
}