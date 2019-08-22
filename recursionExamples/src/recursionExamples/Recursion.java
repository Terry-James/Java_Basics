package recursionExamples;

/*
 * Terry James
 * Recursion
 * 8/22/2019
 * 
 * A program that shows examples of how recursion works.
 * Recursion is simply a method that calls itself until it reaches a base case.
 */

public class Recursion {
	public static void main(String[] args) {
		//System.out.println(factorial(4));
		//System.out.println(fibonacci(7));
		//System.out.println(isPalindrome("anna"));
		/*
		int [] list = {9,2,4,1,6,8,33,3};
		recursiveSelectionHelper(list);
		for(int display: list) {
			System.out.print(display + " ");
		}
		*/
		/*
		int [] list2 = {1,2,3,4,5,6,7};
		binarySearchHelper(list2, 6);
		*/
		hanoiTower(3, 'A', 'B', 'C');
	}
	
	//Method for getting the factorial of a given n value
	public static long factorial(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
			
	}
	
	//Method for getting the fibonacci sequence for a given n value.
	public static long fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	//Method to check if a given String is a palindrome recursively.
	public static boolean isPalindrome(String input) {
		if(input.length() <= 1) { //Base case
			return true;
		}
		else if(input.charAt(0) != input.charAt(input.length()-1)) { //check if letters are not equal
			return false;
		}
		else {
			return isPalindrome(input.substring(1, input.length()-1));//Recursive call to isPalindrome
		}
	}
	
	//A helper method for selection sort
	public static void recursiveSelectionHelper(int [] x) {
		recursiveSelectionSort(x, 0, x.length-1);
	}
	
	//A Method to perform selection sort recursively.
	public static void recursiveSelectionSort(int [] array, int low, int high) {
		if(low < high) {
			int indexOfMin = low;
			int min = array[low];
			for(int i = low +1; i <= high; i++) {
				if(array[i] < min) {
					min = array[i];
					indexOfMin = i;
				}
			}
			array[indexOfMin] = array[low];
			array[low] = min;
			recursiveSelectionSort(array, low + 1, high);
		}
	}
	
	//A helper method to perform binary search recursively.
	public static void binarySearchHelper(int [] list, int key) {
		int low = 0;
		int high = list.length - 1;
		int result = recursiveBinarySearch(list, key, low, high);
		System.out.println("The key " + key + " is located at index " + result);
	}
	
	//A method to perform binary search recursively.
	public static int recursiveBinarySearch(int [] array, int key, int low, int high) {
		int mid = (high + low) / 2; // find the mid index
		while(low <= high) { // base case 
			if(key == array[mid]) { // check to get best case complexity first if true.
				return mid;
			}
			else if(key < array[mid]){
				return recursiveBinarySearch(array, key, low, mid - 1);
			}
			else {
				return recursiveBinarySearch(array, key, mid + 1, high);
			}
		}
		return -1;
	}
	
	//A method to solve the hanoiTowers problem
	public static void hanoiTower(int n, char fromPost, char toPost, char auxPost) {
		if(n == 1) { //base case
			System.out.println("Move disk " + n + " from " + fromPost + " to " + toPost); 
		}
		else {
			hanoiTower(n - 1, fromPost, auxPost, toPost);
			System.out.println("Move disk " + n + " from " + fromPost + " to " + toPost);
			hanoiTower(n - 1, auxPost, toPost, fromPost);
		}
	}
}
