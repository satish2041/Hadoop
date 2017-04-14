package satishnew;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int x=sc.nextInt();
		String s2=sc.next();
		
		System.out.println(s.replaceFirst(s.substring(x),s2));

	}

}
