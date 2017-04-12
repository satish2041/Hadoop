package fact;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(fact(i));
		sc.close();
	}
		public static int fact(int i){
			if(i==0){
				return 1;
			}
			else{
			return i*fact(i-1);	
			}
		}


	}


