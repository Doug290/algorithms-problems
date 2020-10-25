import java.lang.reflect.Array;
import java.util.HashMap;

public class BSADouglas {
	public static void main(String[] args) {

		HashMap<>
	}

	private int recursiveBinarySearch(int[] array, int startPos, int finalPos, int numToFind) {
			int arrayMiddlePos = (startPos+finalPos)/2;
			if (array[arrayMiddlePos] == numToFind) return arrayMiddlePos;
			if (array[arrayMiddlePos] > numToFind) {
				return recursiveBinarySearch(array, arrayMiddlePos+1, finalPos, numToFind);
			} else {
				return recursiveBinarySearch(array, startPos, arrayMiddlePos-1, numToFind);
		}
	}

}
