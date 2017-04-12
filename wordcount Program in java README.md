package wordcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountJava {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		
		
		
		String s=sc.nextLine();
		
		String[] sr=s.split(" ");
		
		for(String a:sr){
		if(m.containsKey(a)){
	         int z=(int)m.get(a);
	         m.put(a,z+1);
	           }
		else{
	m.put(a,1);
		}
		
		}
		System.out.println(m);

	}
