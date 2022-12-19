package path1;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		int count, n;
		try {
			n = fact.scan();
			count = fact.factorial(n);
			
			System.out.println("Number is: " + n);
		    
		    System.out.println("Factorial count is: " + count);
		    
		} catch (MisMatchException e) {
			e.printStackTrace();
			
		}
	}
	
	public int scan() throws MisMatchException{
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Number: ");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                throw new IllegalArgumentException("the number is not match");
            }
        } catch (IllegalArgumentException err) {
        	throw new MisMatchException("is not open: ", err);
        } 
	}
	
	public int factorial(int n) {
		
		if(n == 0) {
			return 1;
		} 
		
		return (n * factorial(n - 1));
	}
}
