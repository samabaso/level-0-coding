package tutorial;

public class task2 {
	public static void main(String[]args) {
		int x = 1 + (1 * 2);
		int	y = (1 + 1) * 2;
		int	z = 1 + ( 1 * 2 );
		int	a = 1 + (1 * (2 / 2));
		
		// i'm confused as how the result of variable b is 1.0 as it should be 1.5 
		double	b = (1 + (1 * 2) ) /  2;
		
		// used the format method to print out multiple variables 
		System.out.printf("%s\n%s\n%s\n%s\n%s",x,y,z,a,b );
	}

}
