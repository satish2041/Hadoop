package satishnew;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		int m=sc.nextInt();
		int n=sc.nextInt();
		int matrix[][]= new int[m][n];
		int transpose[][]=new int[n][m];
		for( a=0;a<m;a++)
			for( b=0;b<n;b++)
				matrix[a][b]=sc.nextInt();
		 for ( a= 0 ; a < m ; a++ )
	      {
	         for ( b = 0 ; b < n ; b++ )               
	            transpose[b][a] = matrix[a][b];
	      }
	 
	      System.out.println("Transpose of entered matrix:-");
	 
	      for ( a = 0 ; a< n ; a++ )
	      {
	         for ( b = 0 ; b < m ; b++ )
	               System.out.print(transpose[a][b]+"\t");
	 
	         System.out.print("\n");
	      }

	}

}
