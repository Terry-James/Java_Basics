package arrayExamples;

public class searchingArrays {

	public static void main(String[] args) {
		valueCreation();
	}
	
	public static void valueCreation() {
		int [] array = {1,2,3,4,5,6,7};
		int result = linearSearch(array, 7);
		System.out.println("The number 7 is located at index: " + result + " using linear search.");
		int results = binarySearch(array, 6);
		System.out.println("The number 6 is located at index: " + results + " using binary search.");

	}
	
	//Method for showing how linear search works. Linear search is good for small unsorted arrays.
	public static int linearSearch(int[] list, int key) {
		int listLength = list.length;
		for(int i = 0; i < listLength; i++) {
			if(key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * Method to show how binary search works. For this method to work the array must already 
	 * be sorted.
	 */
	public static int binarySearch(int[] list, int key) {
		int first = 0;
		int last = list.length-1;
		
		while(last >= first) {
			int mid = (first + last) / 2;
			if(key < list[mid]) {
				mid = mid -1;
			}
			else if(key > list[mid]) {
				first = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
