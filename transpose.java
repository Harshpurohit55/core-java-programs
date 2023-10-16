import java.util.*;

public class transpose 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[][] a1 = new int[3][3];
        int[][] c1 = new int[3][3];
        System.out.println("Enter first array elements : ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of two array : ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                c1[i][j] = a1[j][i];
            }
        }
        System.out.println("Original matrix is : ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(a1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix is : ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(c1[i][j] + "\t");
            }
            System.out.println();
            sc.close();
        }
    }
}