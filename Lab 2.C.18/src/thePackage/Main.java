package thePackage;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import MatrixWork.SearchInMatrix;

/**
 * Chapter 2, Variant C-18.
 * Input n-dimension of the matrix a[n][n].
 * Set values of the matrix elements ranging from -n to n by a random number generator.
 * Find the least of local maximums.
 * (A matrix element is called a local minimum if it's rigorously less than all its neighbours).
 * @author A.Yarashevich
 */
public class Main {
/**
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Input the matrix dimension: ");
		n = scan.nextInt();
		System.out.println("Matrix generated:");
		double[][] matrix = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Math.rint((Math.random() * (2 * n) - n) * 100) / 100;
				System.out.printf("%8.2f", matrix[i][j]);
			}
			System.out.println();
		}
		ArrayList <Double> theList = SearchInMatrix.localMaxesList(matrix);
		double result = Collections.min(theList);
		System.out.println("The minimal local maximum of the matrix is " + result);
		boolean wish;
		System.out.print("Wanna output the whole list of local maximums? - ");
		wish = 1 == scan.nextInt();
		if (wish) {
			System.out.println("All local maximums: " + theList.toString().replace("[", "").replace("]", ""));
		}
		System.out.println("The program's completed...");
		scan.close();
	}
}