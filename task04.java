package tutorial;

import java.util.Scanner;

public class task04 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		  System.out.println("Enter triangle height:");
		    int height = sc.nextInt();
		    System.out.println("Enter triangle base length:");
		    int base = sc.nextInt();
		    System.out.println("Enter trinagle side length");
		    int side = sc.nextInt();
		double area = (0.5 * base) * height;
		System.out.printf("Area of the triangle is %s" ,area);
		
		
	}

}
