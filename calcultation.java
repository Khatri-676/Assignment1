import java.util.Scanner;

public class calcultation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Give the first number:");
		int first = Integer.valueOf(scanner.nextLine());
		System.out.println("Give the second number:");
		int second = Integer.valueOf(scanner.nextLine());
		
	// Add the two numbers 
		int sum =  first + second;
		System.out.println( "The sum of two numbers is :"+ sum);
		
	// Subtract second number from first  
		int  sub =  first -second;
		System.out.println( "The difference  of two numbers is :"+ sub);;
		
	// Multiply the numbers 
		int product =  first * second;
		System.out.println( "The product  of two numbers is :" + product);

	//Divide the numbers 
		double division =   (first*1.0) /second;
				System.out.println( "The divison  of two numbers is :"+ division);

	}

}
