package satishnew;

import java.util.Scanner;

public class PalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String s2=new StringBuilder(s).reverse().toString();
		System.out.println(s2);
		boolean b=s.equalsIgnoreCase(s2);
	System.out.println(b);
		sc.close();

	}

}
