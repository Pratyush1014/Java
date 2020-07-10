import java.util.Scanner ;

public class Alpha
{
	public static void main(String [] args) 
	{
		int arr1[][] = {{1,3,4},{2,4,3},{3,4,5}} ;
		int arr2[][] = {{1,3,4},{2,4,3},{1,2,4}} ;
		int i, j ;
		for (i = 0 ; i < 3 ; i ++)
			{
				for (j = 0 ; j < 3 ; j ++)
				{
					System.out.print(arr1[i][j]+arr2[i][j]+" ") ;
				}
				System.out.println();
			}
	}


}
