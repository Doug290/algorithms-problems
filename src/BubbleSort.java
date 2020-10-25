import java.util.Arrays;

class BubbleSort {
	public static void main(String[] args) {
		int[] newArray = {5,3,1,7,8,2,4,6};

		int[] sortedArray = recursiveBubbleSort(newArray, 1, newArray.length);

		System.out.println(Arrays.toString(sortedArray));
	}

	public static int[] recursiveBubbleSort(int[] arrayToSort, int currentIndex, int endIndex) {
		return bubbleSort(arrayToSort, currentIndex, endIndex);
	}

	public static int[] bubbleSort(int[] arrayToSort, int currentIndex, int endIndex) {
		if (endIndex == 1) return arrayToSort;
		if (currentIndex == endIndex) return bubbleSort(arrayToSort, 1, endIndex-1);
		if (arrayToSort[currentIndex-1] < arrayToSort[currentIndex]) return bubbleSort(arrayToSort, currentIndex+1, endIndex);
		int buff = arrayToSort[currentIndex-1];
		arrayToSort[currentIndex-1] = arrayToSort[currentIndex];
		arrayToSort[currentIndex] = buff;
		return bubbleSort(arrayToSort, currentIndex+1, endIndex);
	}
}
