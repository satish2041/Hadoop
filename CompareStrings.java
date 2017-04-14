package satishnew;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.equals(s2))
			System.out.println("true");
		else
			System.out.println("false");
			
sc.close();
	}

}
