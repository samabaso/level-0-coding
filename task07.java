package tutorial;

import java.util.Scanner;

public class task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Degrees in Celsius:");
		double n=sc.nextInt();
		System.out.println("Degrees in Fahrenheit:");
		double i=sc.nextInt();
		//
		        
		        double fahren = (n*(1.8)) + 32;
		        double celsius = ((i -32) * 5/9);
		        System.out.println("Degrees in Fahrenheit:" +fahren);
		        System.out.println("Degrees in Celsius:" +celsius);
		// TODO Auto-generated method stub

	}
	
	

}
