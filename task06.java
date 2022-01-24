package tutorial;
import java.util.Arrays;
import java.util.Scanner;

public class task06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		

        System.out.println("How many numbers do you want to enter:");
//
        int n=s.nextInt();

        int arr[]=new int[n];
        

        System.out.println("Enter all the numbers you want to enter: [ENTER KEY AFTER EVERY NUMBER]");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }

        for(int i: arr){ //for printing array

            System.out.println(i);
        } 
        int arrr[] = arr;
        int max = Arrays.stream(arrr).max().getAsInt();
        System.out.println("Largest number is " +max);

	}
}
