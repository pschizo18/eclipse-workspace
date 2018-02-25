
public class Sorting {

		// selection sort
	private void sort(int[] array) {
		for (int lh = 0; lh < array.length; lh++) {
			int rh = findSmallest(array, lh, array.length);
			swapElement(array, lh, rh);
		}
	}

	private void swapElement(int[] array, int lh, int rh) {
		int temp = array[lh];
		array[lh] = array[rh];
		array[rh] = temp;
	}

	private int findSmallest(int[] array, int lh, int length) {
		int smallestIndex = lh;
		for (int i = lh + 1; i < length; i++)
			if (array[i] < array[smallestIndex])
				smallestIndex = i;
		return smallestIndex;
	}
}
