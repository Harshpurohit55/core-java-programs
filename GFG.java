import java.io.*;
import java.lang.*;
import java.util.*;

interface Bank 
{
    void deposit();

    void withdraw();

    void loan();

    void account();
}

abstract class Dev1 implements Bank 
{
    public void deposit() 
    {
        System.out.println("Your deposit Amount :" + 20000);
    }
}

abstract class Dev2 extends Dev1 
{
    public void withdraw() 
    {
        System.out.println("Your withdraw Amount :" + 5000);
    }
}

class Dev3 extends Dev2 
{
    public void loan(){
        System.out.println("Your Loan Amount :" + 10000);

    }
    public void account(){
        System.out.println("Your withdraw Amount :" + 12000);
    }
}

class GFG {
    public static void main(String[] args) 
    {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
    }
}