package additionalMathOperations;
/**
 * The class {@code MinMaxOperations} contains methods, finding maximum and minimum values from the array of integers given
 * @author Anthony
 */
public class MinMaxOperations {
	/**
	 * @param number i.e. the number of integers
	 * @param array[] i.e. integers themselves
	 * @return min i.e. minimum of a row of numbers
	 */
	public static int minimum(int number, int[] array) {
		int min = array[0];
		for(int j = 1; j < number; j++) {
			if(array[j] < min) {
				min = array[j];
			}
		}
		return min;
	}
	/**
	 * @param number i.e. number of integers
	 * @param array[] i.e. integers themselves
	 * @return max i.e. maximum of a row of numbers
	 */
	public static int maximum(int number, int[] array) {
		int max = array[0];
		for(int j = 1; j < number; j++) {
			if(array[j] > max) {
				max = array[j];
			}
		}
		return max;
	}
}