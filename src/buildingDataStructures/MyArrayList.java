package buildingDataStructures;

import java.util.Arrays;

public class MyArrayList implements MyList {

	private String[] arr = new String[4];
	private int myLength = 0;

	// We will use this method as a helper method inside this class
	private boolean isFull() {
		return arr.length == myLength;
	}

	// We will use this as a helper method to dynamically increase the size of the
	// array
	private void doubleLength() {
		// Make a copy of the array that is twice as long
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}
		for (int i = myLength; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = data;
		myLength++;

	}

	@Override
	public void removeFromBeginning() {
		if (myLength != 0) {
			for (int i = 0; i < myLength; i++) {
				if (i != myLength - 1) {
					arr[i] = arr[i + 1];
				} else {
					arr[i] = null;
				}
				myLength--;
			}
		}
	}

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			doubleLength();
		}
		arr[myLength] = data;
		myLength++;
	}

	public boolean insertAt(int index, String data) {
		if (index >= myLength) {
			throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
		} else if (index == 0) {
			addAtBeginning(data);
			return true;
		} else if (index == arr.length - 1) {
			addAtEnd(data);
			return true;
		} else {
			if (isFull()) {
				doubleLength();
			}
			for (int i = myLength - 1; i >= index; i--) {
				arr[i + 1] = arr[i];
			}
			arr[index] = data;
			myLength++;
			return true;
		}
	}

	@Override
	public void removeFromEnd() {
		if (myLength != 0) {
			arr[myLength - 1] = null;
			myLength--;
		}
	}

	public boolean removeAt(int index) {
		if (myLength != 0) {
			if (index == 0) {
				removeFromBeginning();
				return true;
			} else if (index == arr.length - 1) {
				removeFromEnd();
				return true;
			} else {
				for (int i = index; i < myLength; i++) {
					if (i != arr.length - 1) {
						arr[i] = arr[i + 1];
					} else {
						arr[i] = null;
					}
				}
				myLength--;
				return true;
			}
		}
		else return false;
	}

	@Override
	public String get(int index) {
		if (index >= myLength) {
			throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
		}
		return arr[index];
	}

	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < myLength; i++) {
			if (i != myLength - 1) {
				sb.append(arr[i] + ", ");
			} else {
				sb.append(arr[i] + "]");
			}
		}
		return sb.toString();
	}
}
