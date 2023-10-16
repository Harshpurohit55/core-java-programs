import java.util.*;
class A
{
    int a;
    void geta(int a)
    {
        this.a=a;

    }
} 
class B extends A
{
    int b;
    void getb(int b)
    {
        this.b=b;

    }
}

class C extends B
{
    int c;
    void getc(int c)
    {
        this.c=c;
        
    }
    int addition()
    {
        return (a+b+c);

    }
}

class addmain
{
    public static void main(String[] args) 
    {
        C c1 = new C();
        c1.geta(12);
        c1.getb(10);
        c1.getc(15);
        System.out.println("Addition of three numbers :" +c1.addition());
    }

}