package tutorial;

import java.util.Scanner;

public class task08 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n =sc.nextInt();
		int hour = n / 60;
		int minutes = n % 60;
		System.out.println(hour  +  "hour(s)" +minutes + "minutes");
		// TODO Auto-generated method stub

	}

}
