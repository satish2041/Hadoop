package satishnew;

import java.util.Scanner;

public class RemoveCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			      String str = sc.nextLine();
			      System.out.println(removeCharAt(str, 3));
			      sc.close();
			   }
			   public static String removeCharAt(String s, int pos) {
			      return s.substring(0, pos) + s.substring(pos + 1);
			   }
			}

	


