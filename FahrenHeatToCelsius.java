package satishnew;

import java.util.Scanner;

public class FahrenHeatToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FahrenHeatToCelsius obj=new FahrenHeatToCelsius();
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		System.out.println(obj.fahrenHeatToCelsius(d));
		System.out.println(celsiusToFahrenHeat(d));
System.out.println();
	}
	public static  double celsiusToFahrenHeat(double degree_c){
		double fahrenheitResult =  (9*(degree_c) / 5) + 32;
	    return fahrenheitResult;
	}
	public double fahrenHeatToCelsius(double degree_f){
		double celsiusResult =  (5*(degree_f - 32)/9);
	    return celsiusResult;
	}
}
