import java.util.*;
public class atm 
{
    public static void main(String[] args)
    {
        System.out.print(" Enter Balance: ");
        Scanner sc=new Scanner(System.in);
        int bb=sc.nextInt();
        System.out.println(" Press 1 for debit ");
        System.out.println(" Press 2 for Credit ");
        System.out.println(" Press 3 for View Balance ");
        int ch=sc.nextInt();
        System.out.print(" Enter Choice ");
        
        switch(ch)
        {
            case 1:
                System.out.print(" Enter Amount to be debit ");
                int debit=sc.nextInt();

                if(bb>=debit)
                {
                    bb=bb-debit;
                    System.out.println("Please collect your money");
                    System.out.println("Your balance is : " +bb);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;

            case 2:
            
                System.out.print("Enter money to be credit:");
                int amt = sc.nextInt();
                bb = bb + amt;
                System.out.println("Your Money has been successfully credit");
                System.out.println("");
                System.out.println("Your balance is : " +bb);

                break;
            
            case 3:
                System.out.println("Balance : "+bb);
                System.out.println("");
                break;


        }
            sc.close();

    }
    
}
