/**
 * The package {@code MatrixWork} is destined for working with matrices in various ways.
 */
package MatrixWork;
import java.io.IOException;
import java.util.ArrayList;

/**
 * The class {@code SearchInMatrix} contains methods applying to matrix in order to find some elements,
 * namely: {@code isLocalMax}, {@code localMaxesList}.
 * @author A.Yarashevich
 */
public class SearchInMatrix {
	/**
	 * The method {@code isLocalMax} inspects whether the element is a local maximum in the matrix.
	 * @param a	the matrix itself
	 * @param x	a vertical position of an element
	 * @param y	a horizontal position of an element
	 * @return answer	either true or false
	 * @throws IOException
	 */
	public static boolean isLocalMax(double[][] a, int x, int y) throws IOException {
		boolean answer = false;
		final int n = a[0].length;
		if (x == 0 && y == 0) {
			if (a[x][y] > a[x + 1][y] && a[x][y] > a[x][y + 1] && a[x][y] > a[x + 1][y + 1]) {
				answer = true;
			}
		} else if (x == 0 && y != 0) {
				if (y == n - 1) {
					if (a[x][y] > a[x][y - 1] && a[x][y] > a[x + 1][y] && a[x][y] > a[x + 1][y - 1]) {
						answer = true;
					}
				} else {
					short count = 5;
					for (int i = x; i <= x + 1; i++) {
						for (int j = y - 1; j <= y + 1; j++) {
							if (i != x || j != y) {
								if(a[i][j] < a[x][y]) {
								count--;
								} else {
									j += 3;
									i += 3;
								}
							}
						}
					}
					if (count == 0) {
						answer = true;
					}	
				}
		} else if (x != 0 && y == 0) {
			if (x == n - 1) {
				if (a[x][y] > a[x - 1][y] && a[x][y] > a[x][y + 1] && a[x][y] > a[x - 1][y + 1]) {
					answer = true;
				}
			} else {
				short count = 5;
				for (int i = x - 1; i <= x + 1; i++) {
					for (int j = y; j <= y + 1; j++) {
						if (i != x || j != y) {
							if(a[i][j] < a[x][y]) {
							count--;
							} else {
								j += 3;
								i += 3;
							}
						}
					}
				}
				if (count == 0) {
					answer = true;
				}	
			}
		} else if (x == n - 1 && y != n - 1) {
			short count = 5;
			for (int i = x - 1; i <= x; i++) {
				for (int j = y - 1; j <= y + 1; j++) {
					if (i != x || j != y) {
						if(a[i][j] < a[x][y]) {
						count--;
						} else {
							j += 3;
							i += 3;
						}
					}
				}
			}
			if (count == 0) {
				answer = true;
			}	
		} else if (x != n - 1 && y == n - 1) {
			short count = 5;
			for (int i = x - 1; i <= x + 1; i++) {
				for (int j = y - 1; j <= y; j++) {
					if (i != x || j != y) {
						if(a[i][j] < a[x][y]) {
						count--;
						} else {
							j += 3;
							i += 3;
						}
					}
				}
			}
			if (count == 0) {
				answer = true;
			}
		} else if (x == n - 1 && y == n - 1) {
			if (a[x][y] > a[x - 1][y] && a[x][y] > a[x][y - 1] && a[x][y] > a[x - 1][y - 1]) {
				answer = true;
			}
		} else {
			short count = 8;
			for (int i = x - 1; i <= x + 1; i++) {
				for (int j = y - 1; j <= y + 1; j++) {
					if (i != x || j != y) {
						if(a[i][j] < a[x][y]) {
						count--;
						} else {
							j += 5;
							i += 5;
						}
					}
				}
			}
			if (count == 0) {
				answer = true;
			}				
		}	
		return answer;
	}
	/**
	 * The method {@code localMaxesList} creates a list of local maximums in the matrix using the method {@code isLocalMax}.
	 * @param matrix	the matrix itself
	 * @return localMaxes	the list of elements being local maximums of the matrix
	 * @throws IOException
	 */
	public static ArrayList <Double> localMaxesList(double[][] matrix) throws IOException {
		ArrayList <Double> localMaxes = new ArrayList<>();
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (isLocalMax(matrix, i, j)) {
					localMaxes.add(matrix[i][j]);
				}
			}
		}
		return localMaxes;
	}
}