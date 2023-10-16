import java.util.*;
public class twodarray
{
	public static void main(String[] args) {
		
		//int a[][] ={{1,2,3,4},{4,5,6,7}};
		int a[][]= new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements:");
		
		for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        a[i][j]=sc.nextInt();
		        //System.out.print(a[i][j]);
		    }
		}
		for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        System.out.print(a[i][j]);
		    }
		    System.out.println();
            sc.close();
		}
	}
}