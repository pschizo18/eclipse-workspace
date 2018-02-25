
public class Searching {
	// an array, and some thing you want to find. find where element was , index
	// or generic, is the element was actually exist in array
	// -1 is returned then doesnt exist

	// linear Search
	public int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	// it takes as much time as the element size
	/********************************************/
	// binary search
	public int binarSearch(int[] array, int key) {
		int lh = 0;
		int rh = array.length - 1;
		while (lh <= rh) {
			int mid = (lh + rh) / 2;
			if (key == array[mid])
				return mid;
			if (key < array[mid])
				rh = mid - 1;
			else
				lh = mid + 1;
		}
		return -1;
	}
	// doesnot gaurantee the returned element if first one in the case of multiple
	// instance in array
	/********************************************/

}
