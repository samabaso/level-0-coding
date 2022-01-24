package tutorial;

import java.io.IOException;
import java.util.Scanner;

public class task010 {
	 static final int MAX_CHAR = 26;
	 
	    static void printCommon(String value1, String value2)
	    {
	       // two arrays of length 26 to store occurrence
	        // of a letters alphabetically for each string
	        int[] a1 = new int[MAX_CHAR];
	        int[] a2 = new int[MAX_CHAR];
	 
	        int length1 = value1.length();
	        int length2 = value2.length();
	 
	        for (int i = 0 ; i < length1 ; i++)
	           a1[value1.charAt(i) - 'a'] += 1;
	 
	        for (int i = 0 ; i < length2 ; i++)
	           a2[value2.charAt(i) - 'a'] += 1;
	 
	        // If a common index is non-zero, it means that the letter corresponding to that index is common to both strings
	        for (int i = 0 ; i < MAX_CHAR ; i++)
	        {
	            if (a1[i] != 0 && a2[i] != 0)
	            {
	                // Find the minimum of the occurrence
	                // of the character in both strings and print
	                // the letter that many number of times
	                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
	                    System.out.print(((char)(i + 'a')));
	            }
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args) throws IOException
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter a string:");
	    	String compare = sc.next();
	    	String value1 = compare;
	    	System.out.println("Enter a string:");
	    	String compare2 = sc.next();
	    	String value2 = compare2;
//	        String value1 = "", val = "";
	        printCommon(value1, value2);
	    }
		
		// TODO Auto-generated method stub

	}
