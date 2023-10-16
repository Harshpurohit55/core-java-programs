import java.io.*;
public class buffer 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any Number: ");
        int no = Integer.parseInt(br.readLine());
        System.out.println("Square of given "+no+ "is" + (no*no));

    }
    
}
