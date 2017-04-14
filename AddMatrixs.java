package satishnew;

import java.util.Scanner;

public class AddMatrixs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		int m=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		int matrix1[][]=new int[m][n];
		int matrix2[][]=new int[p][q];
		int result[][]= new int[m][q];
		if(n != p){
			System.out.println("enter vallid rows and coloumns");
		}
		else{
			for(a=0;a<m;a++)
				for(b=0;b<n;b++)
					matrix1[a][b]=sc.nextInt();
			
			for(a=0;a<p;a++)
				for(b=0;b<q;b++)
					matrix2[a][b]=sc.nextInt();
			
			for(a=0;a<m;a++)
				for(b=0;b<q;b++)
					result[a][b]=matrix1[a][b]+matrix2[a][b];
			
			
			for(a=0;a<m;a++){
				for(b=0;b<q;b++)
					System.out.println(result[a][b]+"\t");
				System.out.println();
			}
				
			
		
		}

	}

}
