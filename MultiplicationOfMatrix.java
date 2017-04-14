package satishnew;

import java.util.Scanner;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum=0;
		int m=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		int matrix1[][]=new int[m][n];
		int matrix2[][]=new int[p][q];
		int result[][]= new int[m][q];
		if(n!=p){
			System.out.println("give correct order");
		}
		else{
		
		for(a=0;a<m;a++)
			for(b=0;b<n;b++)
				matrix1[a][b]=sc.nextInt();
		
		for(a=0;a<p;a++)
			for(b=0;b<q;b++)
				matrix2[a][b]=sc.nextInt();
		
		for(a=0;a<m;a++){
			for(b=0;b<q;b++){
				for(c=0;c<p;c++){
					sum=sum+(matrix1[a][c]*matrix2[c][b]);
			}
			result[a][b]=sum;
			sum=0;
			}
		}
		
			
		
			
		
		for(a=0;a<m;a++){
			for(b=0;b<q;b++)
				System.out.println(result[a][b]+"\t");
			System.out.println();
		}
		}
sc.close();
	}

}
