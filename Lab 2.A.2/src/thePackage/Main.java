/**
 * {@code thePackage} is the main package of the project.
 */
package thePackage;
import java.io.IOException;
import java.util.Date;
import IntMethods.IntSort;
import java.util.Scanner;

/**
 * Chapter 2, Variant A-2. 
 * Input n numbers from the console. Arrange and output the numbers in order of their length values increasing (decreasing).
 * @author A.Yarashevich
 */
public class Main {
	private static final String author = "A.Yarashevich";
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n;		
		/**
		 * All the numbers being input are supposed to be integers for simplifying their length determining. 
		 * Every negative integer has a minus sign, adding 1 to their length value.
		 */
		boolean repeat = true;
		while (repeat) {
			System.out.print("Input the number of integers: ");
			n = scan.nextInt();
			int[][] matrix = new int[2][n];
			System.out.print("Input " + n + " integers: ");
			for(int i = 0; i < n; i++) {
				matrix[0][i] = scan.nextInt();	
			}
			IntSort.lengthSort(matrix);
			System.out.print("Wanna repeat the procedure for new integers? - ");
			repeat = 1 == scan.nextInt();
		}
		Date date = new Date();
		System.out.println("The program's completed on " + date.toString());
		System.out.println("The author is " + author);
		scan.close();
	}
}