package satishnew;

import java.util.Scanner;

public class LastOccurenceOfSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "satishbaburavipati";
		String s1=s.substring(5);
		String s2=s1.substring(5);
		System.out.println(s.lastIndexOf(s2,6));
		
		
	}

}
