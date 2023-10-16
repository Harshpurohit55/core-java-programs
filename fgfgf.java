public class fgfgf
{
    static void fibo(int n)
    {
        int n1=0,n2=1;
        System.out.print(n1+"\t"+n2);
        for(int i=2; i<=n;i++)
        {
            int n3=n1+n2;
            System.out.print("\t"+n3);
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String[] args)
    {
        fibo(6);

    }

}