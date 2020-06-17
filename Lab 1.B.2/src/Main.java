import additionalMathOperations.MinMaxOperations;
import java.io.IOException;
import java.util.Scanner;
/**
 * @see Chapter 1. Variant B-2
 * Input n integers from the console
 * Output minimum and maximum integers
 * @author Anthony
 * The main class of the program
 */
public class Main {	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Input the number of integers: ");
		n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Input " + n + " integers: ");
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();	
		}
		System.out.println("The highest value is " + MinMaxOperations.minimum(n, array));
		System.out.println("The lowest value is " + MinMaxOperations.maximum(n, array));
		scan.close();
	}
}