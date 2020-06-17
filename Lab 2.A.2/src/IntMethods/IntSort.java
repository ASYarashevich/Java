/**
 * {@code IntMethods} is the additional package containing some methods applying for [int] type variables and arrays.
 */
package IntMethods;
import java.io.IOException;
import java.util.Scanner;

/**
 * The class {@code IntSort} contains methods, sorting integers in various orders,
 * namely: {@code lengthSort}, {@code incLength}, {@code decLength}.
 * @author A.Yarashevich
 */
public class IntSort {
	/**
	 * @param matrixL	two arrays: one contains integers, another one is empty at the entry and being filled with integers' lengths respectively afterwards
	 * @throws IOException
	 */
	public static void lengthSort(int[][] matrixL) throws IOException {
		String help = new String();
		int n = matrixL[0].length;
		for (int i = 0; i < n; i++)
		{
			help = String.valueOf(matrixL[0][i]);
			matrixL[1][i] = help.length();
		}
		Scanner sc = new Scanner(System.in);
		boolean option;
		System.out.print("Would you prefer the integers to be arranged in ascending (1) or descending (0) order of their lengths? - ");
		option = 1 == sc.nextInt();
		if (option) {
			matrixL = incLength(n, matrixL);
			for (int i = 0; i < n; i++) {
				System.out.print(matrixL[0][i] + " ");
			}
		} else {
			matrixL = decLength(n, matrixL);
			for (int i = 0; i < n; i++) {
				System.out.print(matrixL[0][i] + " ");
			}
		}
		boolean add;
		System.out.print("\nTo sort in ");
		if (option) {
			System.out.print("descending order? - ");
			add = 1 == sc.nextInt();
			if (add) {
				for (int i = n -1; i >= 0; i--) {
					System.out.print(matrixL[0][i] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.print("ascending order? - ");
			add = 1 == sc.nextInt();
			if (add) {
				for (int i = n - 1; i >= 0; i--) {
					System.out.print(matrixL[0][i] + " ");
				}
				System.out.println();	
			}
		}
//		sc.close();
	}
	/**
	 * @param n	the number of integers
	 * @param matrixIL	two arrays: one with integers input, second with their lengths
	 * @return matrixIL	the matrix input, but sorted according to integers' lengths (in ascending order)
	 */
	private static int[][] incLength(int n, int[][] matrixIL) {
		int help;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				for (int k = 0; k <= 1; k++) {
					if (matrixIL[1][j] > matrixIL[1][j + 1]) {
						help = matrixIL[k][j + 1];
						matrixIL[k][j + 1] = matrixIL[k][j];
						matrixIL[k][j] = help;
					} else {
						k++;
					}
				}
			}
		}
		return matrixIL;
	}
	/**
	 * @param n	the number of integers
	 * @param matrixDL	two arrays: one with integers input, second with their lengths
	 * @return matrixDL	the matrix input, but sorted according to integers' lengths (in descending order)
	 */
	private static int[][] decLength(int n, int[][] matrixDL) {
		int help;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				for (int k = 0; k <= 1; k++) {
					if (matrixDL[1][j] < matrixDL[1][j + 1]) {
						help = matrixDL[k][j + 1];
						matrixDL[k][j + 1] = matrixDL[k][j];
						matrixDL[k][j] = help;
					} else {
						k++;
					}
				}
			}
		}		
		return matrixDL;
	}
}