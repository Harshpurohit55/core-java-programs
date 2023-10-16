import  java.util.*;
public class additionmatrix
{
	public static void main(String[] args) 
    {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Addition of Two Matrix");
		int[][] a1=new int[3][3];
		int[][] b1=new int[3][3];
		int[][] c1=new int[3][3];
		System.out.println("Enter first array elements : ");
		for (int i=0;i<3;i++)
        {
		    for(int j=0;j<3;j++)
            {
		        a1[i][j]= sc.nextInt();
		         }
		}
		System.out.println("Enter second array elements : ");
		for (int i=0;i<3;i++)
        {
		    for(int j=0;j<3;j++)
            {
		        b1[i][j]= sc.nextInt();
		    }
		}
		System.out.println("Addition of two arrays : ");
		for (int i=0;i<3;i++)
        {
		    for(int j=0; j<3;j++)
            {
		        c1[i][j]= a1[i][j] + b1[i][j];
		    }
		}
		for (int i=0;i<3;i++)
        {
		    for(int j=0;j<3;j++)
            {
		       System.out.print(c1[i][j] + "\t" );
		    }
		         System.out.println();
                 sc.close();
		}
		
		
		
	}
}