package wordcount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lcm {

	public static void main(String[] args)throws Exception {
		
	Scanner sc=new Scanner(System.in);
	int z=0;	
 int a=sc.nextInt();
 int b=sc.nextInt();
 for(int i=1;i<b;i++){
	  z=a*i;
	 if(z%b==0){
		 break;
	 }
	 
 }
	System.out.println(z);	
	}
}
		
		


